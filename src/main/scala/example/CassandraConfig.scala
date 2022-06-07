package example


case class ServiceConf(
                        cassandra: CassandraConfig
                          )

case class CassandraConfig(
                            contactPoints: Seq[String]
                          )
