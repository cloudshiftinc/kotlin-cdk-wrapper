@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The versions for the Aurora PostgreSQL cluster engine (those returned by
 * `DatabaseClusterEngine.auroraPostgres`).
 *
 * https://docs.aws.amazon.com/AmazonRDS/latest/AuroraPostgreSQLReleaseNotes/AuroraPostgreSQL.Updates.html
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
public open class AuroraPostgresEngineVersion(
  cdkObject: software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion,
) : CdkObject(cdkObject) {
  /**
   * The full version string, for example, "9.6.25.1".
   */
  public open fun auroraPostgresFullVersion(): String = unwrap(this).getAuroraPostgresFullVersion()

  /**
   * The major version of the engine, for example, "9.6".
   */
  public open fun auroraPostgresMajorVersion(): String =
      unwrap(this).getAuroraPostgresMajorVersion()

  public companion object {
    public val VER_10_11: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_11)

    public val VER_10_12: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_12)

    public val VER_10_13: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_13)

    public val VER_10_14: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_14)

    public val VER_10_16: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_16)

    public val VER_10_17: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_17)

    public val VER_10_18: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_18)

    public val VER_10_19: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_19)

    public val VER_10_20: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_20)

    public val VER_10_21: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_21)

    public val VER_10_4: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_4)

    public val VER_10_5: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_5)

    public val VER_10_6: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_6)

    public val VER_10_7: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_10_7)

    public val VER_11_11: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_11)

    public val VER_11_12: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_12)

    public val VER_11_13: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_13)

    public val VER_11_14: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_14)

    public val VER_11_15: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_15)

    public val VER_11_16: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_16)

    public val VER_11_17: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_17)

    public val VER_11_18: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_18)

    public val VER_11_19: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_19)

    public val VER_11_20: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_20)

    public val VER_11_21: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_21)

    public val VER_11_4: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_4)

    public val VER_11_6: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_6)

    public val VER_11_7: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_7)

    public val VER_11_8: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_8)

    public val VER_11_9: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_11_9)

    public val VER_12_10: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_10)

    public val VER_12_11: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_11)

    public val VER_12_12: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_12)

    public val VER_12_13: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_13)

    public val VER_12_14: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_14)

    public val VER_12_15: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_15)

    public val VER_12_16: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_16)

    public val VER_12_17: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_17)

    public val VER_12_18: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_18)

    public val VER_12_19: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_19)

    public val VER_12_4: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_4)

    public val VER_12_6: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_6)

    public val VER_12_7: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_7)

    public val VER_12_8: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_8)

    public val VER_12_9: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_12_9)

    public val VER_13_10: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_10)

    public val VER_13_11: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_11)

    public val VER_13_12: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_12)

    public val VER_13_13: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_13)

    public val VER_13_14: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_14)

    public val VER_13_15: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_15)

    public val VER_13_3: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_3)

    public val VER_13_4: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_4)

    public val VER_13_5: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_5)

    public val VER_13_6: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_6)

    public val VER_13_7: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_7)

    public val VER_13_8: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_8)

    public val VER_13_9: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_13_9)

    public val VER_14_10: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_14_10)

    public val VER_14_11: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_14_11)

    public val VER_14_12: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_14_12)

    public val VER_14_3: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_14_3)

    public val VER_14_4: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_14_4)

    public val VER_14_5: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_14_5)

    public val VER_14_6: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_14_6)

    public val VER_14_7: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_14_7)

    public val VER_14_8: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_14_8)

    public val VER_14_9: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_14_9)

    public val VER_15_2: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_15_2)

    public val VER_15_3: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_15_3)

    public val VER_15_4: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_15_4)

    public val VER_15_5: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_15_5)

    public val VER_15_6: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_15_6)

    public val VER_15_7: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_15_7)

    public val VER_16_0: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_16_0)

    public val VER_16_1: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_16_1)

    public val VER_16_2: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_16_2)

    public val VER_16_3: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_16_3)

    public val VER_9_6_11: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_9_6_11)

    public val VER_9_6_12: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_9_6_12)

    public val VER_9_6_16: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_9_6_16)

    public val VER_9_6_17: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_9_6_17)

    public val VER_9_6_18: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_9_6_18)

    public val VER_9_6_19: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_9_6_19)

    public val VER_9_6_22: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_9_6_22)

    public val VER_9_6_8: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_9_6_8)

    public val VER_9_6_9: AuroraPostgresEngineVersion =
        AuroraPostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.VER_9_6_9)

    public fun of(auroraPostgresFullVersion: String, auroraPostgresMajorVersion: String):
        AuroraPostgresEngineVersion =
        software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.of(auroraPostgresFullVersion,
        auroraPostgresMajorVersion).let(AuroraPostgresEngineVersion::wrap)

    public fun of(
      auroraPostgresFullVersion: String,
      auroraPostgresMajorVersion: String,
      auroraPostgresFeatures: AuroraPostgresEngineFeatures,
    ): AuroraPostgresEngineVersion =
        software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion.of(auroraPostgresFullVersion,
        auroraPostgresMajorVersion,
        auroraPostgresFeatures.let(AuroraPostgresEngineFeatures.Companion::unwrap)).let(AuroraPostgresEngineVersion::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ef8f32dd92680ee16644cf106bac65a4efdbe548075bf1504d89001bc8aa9096")
    public fun of(
      auroraPostgresFullVersion: String,
      auroraPostgresMajorVersion: String,
      auroraPostgresFeatures: AuroraPostgresEngineFeatures.Builder.() -> Unit,
    ): AuroraPostgresEngineVersion = of(auroraPostgresFullVersion, auroraPostgresMajorVersion,
        AuroraPostgresEngineFeatures(auroraPostgresFeatures))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion):
        AuroraPostgresEngineVersion = AuroraPostgresEngineVersion(cdkObject)

    internal fun unwrap(wrapped: AuroraPostgresEngineVersion):
        software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.AuroraPostgresEngineVersion
  }
}
