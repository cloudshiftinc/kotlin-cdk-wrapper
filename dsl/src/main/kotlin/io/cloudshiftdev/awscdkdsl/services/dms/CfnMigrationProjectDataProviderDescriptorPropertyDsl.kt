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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dms.CfnMigrationProject

/**
 * Information about a data provider.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * DataProviderDescriptorProperty dataProviderDescriptorProperty =
 * DataProviderDescriptorProperty.builder()
 * .dataProviderArn("dataProviderArn")
 * .dataProviderIdentifier("dataProviderIdentifier")
 * .dataProviderName("dataProviderName")
 * .secretsManagerAccessRoleArn("secretsManagerAccessRoleArn")
 * .secretsManagerSecretId("secretsManagerSecretId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-dataproviderdescriptor.html)
 */
@CdkDslMarker
public class CfnMigrationProjectDataProviderDescriptorPropertyDsl {
    private val cdkBuilder: CfnMigrationProject.DataProviderDescriptorProperty.Builder =
        CfnMigrationProject.DataProviderDescriptorProperty.builder()

    /** @param dataProviderArn The Amazon Resource Name (ARN) of the data provider. */
    public fun dataProviderArn(dataProviderArn: String) {
        cdkBuilder.dataProviderArn(dataProviderArn)
    }

    /** @param dataProviderIdentifier the value to be set. */
    public fun dataProviderIdentifier(dataProviderIdentifier: String) {
        cdkBuilder.dataProviderIdentifier(dataProviderIdentifier)
    }

    /** @param dataProviderName The user-friendly name of the data provider. */
    public fun dataProviderName(dataProviderName: String) {
        cdkBuilder.dataProviderName(dataProviderName)
    }

    /**
     * @param secretsManagerAccessRoleArn The ARN of the role used to access AWS Secrets Manager.
     */
    public fun secretsManagerAccessRoleArn(secretsManagerAccessRoleArn: String) {
        cdkBuilder.secretsManagerAccessRoleArn(secretsManagerAccessRoleArn)
    }

    /**
     * @param secretsManagerSecretId The identifier of the AWS Secrets Manager Secret used to store
     *   access credentials for the data provider.
     */
    public fun secretsManagerSecretId(secretsManagerSecretId: String) {
        cdkBuilder.secretsManagerSecretId(secretsManagerSecretId)
    }

    public fun build(): CfnMigrationProject.DataProviderDescriptorProperty = cdkBuilder.build()
}
