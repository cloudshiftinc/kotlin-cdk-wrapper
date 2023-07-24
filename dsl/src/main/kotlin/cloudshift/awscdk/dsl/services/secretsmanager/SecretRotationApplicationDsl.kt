@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.secretsmanager.SecretRotationApplication
import kotlin.Boolean
import kotlin.String

/**
 * A secret rotation serverless application.
 *
 * Example:
 *
 * ```
 * Secret myUserSecret;
 * Secret myMasterSecret;
 * IConnectable myDatabase;
 * Vpc myVpc;
 * SecretRotation.Builder.create(this, "SecretRotation")
 * .application(SecretRotationApplication.MYSQL_ROTATION_MULTI_USER)
 * .secret(myUserSecret) // The secret that will be rotated
 * .masterSecret(myMasterSecret) // The secret used for the rotation
 * .target(myDatabase)
 * .vpc(myVpc)
 * .build();
 * ```
 */
@CdkDslMarker
public class SecretRotationApplicationDsl(
    applicationId: String,
    semanticVersion: String
) {
    private val cdkBuilder: SecretRotationApplication.Builder =
        SecretRotationApplication.Builder.create(applicationId, semanticVersion)

    /**
     * Whether the rotation application uses the mutli user scheme.
     *
     * Default: false
     *
     * @param isMultiUser Whether the rotation application uses the mutli user scheme.
     */
    public fun isMultiUser(isMultiUser: Boolean) {
        cdkBuilder.isMultiUser(isMultiUser)
    }

    public fun build(): SecretRotationApplication = cdkBuilder.build()
}
