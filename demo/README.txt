WIKIPEDIA
=========
HOW TO DEMO
===========
1. Set the MikiPedia API credentials in the mule-app.properties

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






