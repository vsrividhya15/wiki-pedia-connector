WIKIPEDIA
=========
HOW TO DEMO
===========
Test the flows

With Anypoint Studio up and running, open the Import wizard from the File menu. 
A pop-up wizard will offer you the chance to pick Anypoint Studio Project from External Location. 
On the next wizard window point Project Root to the location of the demo project and select the Server Runtime .
Once successfully imported the studio will automatically present the Mule Flows.

From the Package Explorer view, expand the demo project and open the mule-app.properties file. Fill in the credentials of MediaWiki API.


example-param-info
====================
This is a demo about Obtain information about API modules.

Run the WikiPediaFunctionalTest or deploy the flow in the mule container and hit http://localhost:9098/wiki/paraminfo

example-parse
=============
This is a demo about parsing content and returns parser output.
See the various prop-modules of action=query to get information from the current version of a page.

Run the WikiPediaFunctionalTest or deploy the flow in the mule container and hit http://localhost:9096/wiki/parse

example-purge
============
This is a demo about purging the cache for the given titles.

Requires a POST request if the user is not logged in.

Run the WikiPediaFunctionalTest or deploy the flow in the mule container and hit http://localhost:9097/wiki/purge

example-search
==============
This is a demo about searching the wiki using the OpenSearch protocol.

Run the WikiPediaFunctionalTest or deploy the flow in the mule container and hit http://localhost:9095/wiki/search


example-query-meta
==================

This is a demo about fetching data from and about MediaWiki.

All data modifications will first have to use query to acquire a token to prevent abuse from malicious sites.

Run the WikiPediaFunctionalTest or deploy the flow in the mule container and hit http://localhost:9090/wiki/query/meta






