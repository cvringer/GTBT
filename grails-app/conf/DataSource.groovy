dataSource {
    dbCreate = "create-drop" // one of 'create', 'create-drop', 'update', 'validate', ''
    pooled = true
    driverClassName = "org.postgresql.Driver"
    username = "postgres"
    password = "postgres"
    url = "jdbc:postgresql:gen"
}
hibernate {
    dialect = "org.hibernate.dialect.PostgresPlusDialect"
    cache.use_second_level_cache = true
    cache.use_query_cache = true
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            pooled = true
            driverClassName = "org.postgresql.Driver"
            username = "postgres"
            password = "postgres"
            url = "jdbc:postgresql:gen"
        }
    }
    test {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            pooled = true
            driverClassName = "org.postgresql.Driver"
            username = "postgres"
            password = "postgres"
            url = "jdbc:postgresql:gen"
        }
    }
    production {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            pooled = true
            driverClassName = "org.postgresql.Driver"
            username = "postgres"
            password = "postgres"
            url = "jdbc:postgresql:gen"
        }
    }
}
