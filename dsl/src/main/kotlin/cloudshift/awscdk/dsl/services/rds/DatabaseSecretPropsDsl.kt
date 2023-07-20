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
import software.amazon.awscdk.services.rds.DatabaseSecretProps
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class DatabaseSecretPropsDsl {
    private val cdkBuilder: DatabaseSecretProps.Builder = DatabaseSecretProps.builder()

    private val _replicaRegions: MutableList<ReplicaRegion> = mutableListOf()

    public fun dbname(dbname: String) {
        cdkBuilder.dbname(dbname)
    }

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
    }

    public fun masterSecret(masterSecret: ISecret) {
        cdkBuilder.masterSecret(masterSecret)
    }

    public fun replaceOnPasswordCriteriaChanges(replaceOnPasswordCriteriaChanges: Boolean) {
        cdkBuilder.replaceOnPasswordCriteriaChanges(replaceOnPasswordCriteriaChanges)
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

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): DatabaseSecretProps {
        if (_replicaRegions.isNotEmpty()) cdkBuilder.replicaRegions(_replicaRegions)
        return cdkBuilder.build()
    }
}
