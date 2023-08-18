@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.rds.PostgresEngineVersion
import software.amazon.awscdk.services.rds.PostgresInstanceEngineProps

/**
 * Properties for PostgreSQL instance engines.
 *
 * Used in `DatabaseInstanceEngine.postgres`.
 *
 * Example:
 * ```
 * Vpc vpc;
 * IInstanceEngine engine =
 * DatabaseInstanceEngine.postgres(PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_15_2).build());
 * Key myKey = new Key(this, "MyKey");
 * DatabaseInstance.Builder.create(this, "InstanceWithCustomizedSecret")
 * .engine(engine)
 * .vpc(vpc)
 * .credentials(Credentials.fromGeneratedSecret("postgres", CredentialsBaseOptions.builder()
 * .secretName("my-cool-name")
 * .encryptionKey(myKey)
 * .excludeCharacters("!&amp;*^#&#64;()")
 * .replicaRegions(List.of(ReplicaRegion.builder().region("eu-west-1").build(),
 * ReplicaRegion.builder().region("eu-west-2").build()))
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class PostgresInstanceEnginePropsDsl {
    private val cdkBuilder: PostgresInstanceEngineProps.Builder =
        PostgresInstanceEngineProps.builder()

    /** @param version The exact version of the engine to use. */
    public fun version(version: PostgresEngineVersion) {
        cdkBuilder.version(version)
    }

    public fun build(): PostgresInstanceEngineProps = cdkBuilder.build()
}
