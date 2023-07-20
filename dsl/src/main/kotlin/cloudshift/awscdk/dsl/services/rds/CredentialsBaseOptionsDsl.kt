@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.secretsmanager.ReplicaRegionDsl
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.rds.CredentialsBaseOptions
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CredentialsBaseOptionsDsl {
    private val cdkBuilder: CredentialsBaseOptions.Builder = CredentialsBaseOptions.builder()

    private val _replicaRegions: MutableList<ReplicaRegion> = mutableListOf()

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
    }

    public fun replicaRegions(replicaRegions: ReplicaRegionDsl.() -> Unit) {
        _replicaRegions.add(ReplicaRegionDsl().apply(replicaRegions).build())
    }

    public fun replicaRegions(replicaRegions: Collection<ReplicaRegion>) {
        _replicaRegions.addAll(replicaRegions)
    }

    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    public fun build(): CredentialsBaseOptions {
        if (_replicaRegions.isNotEmpty()) cdkBuilder.replicaRegions(_replicaRegions)
        return cdkBuilder.build()
    }
}
