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
 * The property describes schema conversion application attributes for the migration project.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * SchemaConversionApplicationAttributesProperty schemaConversionApplicationAttributesProperty =
 * SchemaConversionApplicationAttributesProperty.builder()
 * .s3BucketPath("s3BucketPath")
 * .s3BucketRoleArn("s3BucketRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-migrationproject-schemaconversionapplicationattributes.html)
 */
@CdkDslMarker
public class CfnMigrationProjectSchemaConversionApplicationAttributesPropertyDsl {
    private val cdkBuilder:
        CfnMigrationProject.SchemaConversionApplicationAttributesProperty.Builder =
        CfnMigrationProject.SchemaConversionApplicationAttributesProperty.builder()

    /** @param s3BucketPath the value to be set. */
    public fun s3BucketPath(s3BucketPath: String) {
        cdkBuilder.s3BucketPath(s3BucketPath)
    }

    /** @param s3BucketRoleArn the value to be set. */
    public fun s3BucketRoleArn(s3BucketRoleArn: String) {
        cdkBuilder.s3BucketRoleArn(s3BucketRoleArn)
    }

    public fun build(): CfnMigrationProject.SchemaConversionApplicationAttributesProperty =
        cdkBuilder.build()
}
