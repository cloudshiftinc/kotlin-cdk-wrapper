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

package cloudshift.awscdk.dsl.services.docdb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.docdb.DatabaseSecret
import software.amazon.awscdk.services.kms.IKey
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class DatabaseSecretDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DatabaseSecret.Builder = DatabaseSecret.Builder.create(scope, id)

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun excludeCharacters(excludeCharacters: String) {
        cdkBuilder.excludeCharacters(excludeCharacters)
    }

    public fun masterSecret(masterSecret: ISecret) {
        cdkBuilder.masterSecret(masterSecret)
    }

    public fun secretName(secretName: String) {
        cdkBuilder.secretName(secretName)
    }

    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): DatabaseSecret = cdkBuilder.build()
}
