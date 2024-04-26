@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Creation properties of the Aurora PostgreSQL database cluster engine.
 *
 * Used in `DatabaseClusterEngine.auroraPostgres`.
 *
 * Example:
 *
 * ```
 * // Build a data source for AppSync to access the database.
 * GraphqlApi api;
 * // Create username and password secret for DB Cluster
 * DatabaseSecret secret = DatabaseSecret.Builder.create(this, "AuroraSecret")
 * .username("clusteradmin")
 * .build();
 * // The VPC to place the cluster in
 * Vpc vpc = new Vpc(this, "AuroraVpc");
 * // Create the serverless cluster, provide all values needed to customise the database.
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "AuroraClusterV2")
 * .engine(DatabaseClusterEngine.auroraPostgres(AuroraPostgresClusterEngineProps.builder().version(AuroraPostgresEngineVersion.VER_15_5).build()))
 * .credentials(Map.of("username", "clusteradmin"))
 * .clusterIdentifier("db-endpoint-test")
 * .writer(ClusterInstance.serverlessV2("writer"))
 * .serverlessV2MinCapacity(2)
 * .serverlessV2MaxCapacity(10)
 * .vpc(vpc)
 * .defaultDatabaseName("demos")
 * .enableDataApi(true)
 * .build();
 * RdsDataSource rdsDS = api.addRdsDataSourceV2("rds", cluster, secret, "demos");
 * // Set up a resolver for an RDS query.
 * rdsDS.createResolver("QueryGetDemosRdsResolver", BaseResolverProps.builder()
 * .typeName("Query")
 * .fieldName("getDemosRds")
 * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n   
 * \"statements\": [\n      \"SELECT * FROM demos\"\n    ]\n  }\n  "))
 * .responseMappingTemplate(MappingTemplate.fromString("\n   
 * $utils.toJson($utils.rds.toJsonObject($ctx.result)[0])\n  "))
 * .build());
 * // Set up a resolver for an RDS mutation.
 * rdsDS.createResolver("MutationAddDemoRdsResolver", BaseResolverProps.builder()
 * .typeName("Mutation")
 * .fieldName("addDemoRds")
 * .requestMappingTemplate(MappingTemplate.fromString("\n  {\n    \"version\": \"2018-05-29\",\n   
 * \"statements\": [\n      \"INSERT INTO demos VALUES (:id, :version)\",\n      \"SELECT * WHERE id =
 * :id\"\n    ],\n    \"variableMap\": {\n      \":id\": $util.toJson($util.autoId()),\n     
 * \":version\": $util.toJson($ctx.args.version)\n    }\n  }\n  "))
 * .responseMappingTemplate(MappingTemplate.fromString("\n   
 * $utils.toJson($utils.rds.toJsonObject($ctx.result)[1][0])\n  "))
 * .build());
 * ```
 */
public interface AuroraPostgresClusterEngineProps {
  /**
   * The version of the Aurora PostgreSQL cluster engine.
   */
  public fun version(): AuroraPostgresEngineVersion

  /**
   * A builder for [AuroraPostgresClusterEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The version of the Aurora PostgreSQL cluster engine. 
     */
    public fun version(version: AuroraPostgresEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps.Builder =
        software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps.builder()

    /**
     * @param version The version of the Aurora PostgreSQL cluster engine. 
     */
    override fun version(version: AuroraPostgresEngineVersion) {
      cdkBuilder.version(version.let(AuroraPostgresEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps,
  ) : CdkObject(cdkObject), AuroraPostgresClusterEngineProps {
    /**
     * The version of the Aurora PostgreSQL cluster engine.
     */
    override fun version(): AuroraPostgresEngineVersion =
        unwrap(this).getVersion().let(AuroraPostgresEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuroraPostgresClusterEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps):
        AuroraPostgresClusterEngineProps = CdkObjectWrappers.wrap(cdkObject) as?
        AuroraPostgresClusterEngineProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuroraPostgresClusterEngineProps):
        software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps
  }
}
