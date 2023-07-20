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
import software.amazon.awscdk.services.rds.DatabaseSecret
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.ReplicaRegion
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class DatabaseSecretDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DatabaseSecret.Builder = DatabaseSecret.Builder.create(scope, id)

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

    public fun build(): DatabaseSecret {
        if (_replicaRegions.isNotEmpty()) cdkBuilder.replicaRegions(_replicaRegions)
        return cdkBuilder.build()
    }
}
