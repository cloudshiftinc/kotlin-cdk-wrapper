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

package io.cloudshiftdev.awscdkdsl.services.athena

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnWorkGroup

/**
 * The information about the updates in the query results, such as output location and encryption
 * configuration for the query results.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.athena.*;
 * ResultConfigurationUpdatesProperty resultConfigurationUpdatesProperty =
 * ResultConfigurationUpdatesProperty.builder()
 * .aclConfiguration(AclConfigurationProperty.builder()
 * .s3AclOption("s3AclOption")
 * .build())
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .encryptionOption("encryptionOption")
 * // the properties below are optional
 * .kmsKey("kmsKey")
 * .build())
 * .expectedBucketOwner("expectedBucketOwner")
 * .outputLocation("outputLocation")
 * .removeAclConfiguration(false)
 * .removeEncryptionConfiguration(false)
 * .removeExpectedBucketOwner(false)
 * .removeOutputLocation(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-athena-workgroup-resultconfigurationupdates.html)
 */
@CdkDslMarker
public class CfnWorkGroupResultConfigurationUpdatesPropertyDsl {
    private val cdkBuilder: CfnWorkGroup.ResultConfigurationUpdatesProperty.Builder =
        CfnWorkGroup.ResultConfigurationUpdatesProperty.builder()

    /** @param aclConfiguration The ACL configuration for the query results. */
    public fun aclConfiguration(aclConfiguration: IResolvable) {
        cdkBuilder.aclConfiguration(aclConfiguration)
    }

    /** @param aclConfiguration The ACL configuration for the query results. */
    public fun aclConfiguration(aclConfiguration: CfnWorkGroup.AclConfigurationProperty) {
        cdkBuilder.aclConfiguration(aclConfiguration)
    }

    /** @param encryptionConfiguration The encryption configuration for the query results. */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /** @param encryptionConfiguration The encryption configuration for the query results. */
    public fun encryptionConfiguration(
        encryptionConfiguration: CfnWorkGroup.EncryptionConfigurationProperty
    ) {
        cdkBuilder.encryptionConfiguration(encryptionConfiguration)
    }

    /**
     * @param expectedBucketOwner The AWS account ID that you expect to be the owner of the Amazon
     *   S3 bucket specified by `ResultConfiguration$OutputLocation` . If set, Athena uses the value
     *   for `ExpectedBucketOwner` when it makes Amazon S3 calls to your specified output location.
     *   If the `ExpectedBucketOwner` AWS account ID does not match the actual owner of the Amazon
     *   S3 bucket, the call fails with a permissions error.
     *
     * If workgroup settings override client-side settings, then the query uses the
     * `ExpectedBucketOwner` setting that is specified for the workgroup, and also uses the location
     * for storing query results specified in the workgroup. See
     * `WorkGroupConfiguration$EnforceWorkGroupConfiguration` and
     * [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html)
     * .
     */
    public fun expectedBucketOwner(expectedBucketOwner: String) {
        cdkBuilder.expectedBucketOwner(expectedBucketOwner)
    }

    /**
     * @param outputLocation The location in Amazon S3 where your query results are stored, such as
     *   `s3://path/to/query/bucket/` . For more information, see
     *   [Query Results](https://docs.aws.amazon.com/athena/latest/ug/querying.html) If workgroup
     *   settings override client-side settings, then the query uses the location for the query
     *   results and the encryption configuration that are specified for the workgroup. The
     *   "workgroup settings override" is specified in EnforceWorkGroupConfiguration (true/false) in
     *   the WorkGroupConfiguration. See `EnforceWorkGroupConfiguration` .
     */
    public fun outputLocation(outputLocation: String) {
        cdkBuilder.outputLocation(outputLocation)
    }

    /**
     * @param removeAclConfiguration If set to `true` , indicates that the previously-specified ACL
     *   configuration for queries in this workgroup should be ignored and set to null. If set to
     *   `false` or not set, and a value is present in the `AclConfiguration` of
     *   `ResultConfigurationUpdates` , the `AclConfiguration` in the workgroup's
     *   `ResultConfiguration` is updated with the new value. For more information, see
     *   [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html)
     *   .
     */
    public fun removeAclConfiguration(removeAclConfiguration: Boolean) {
        cdkBuilder.removeAclConfiguration(removeAclConfiguration)
    }

    /**
     * @param removeAclConfiguration If set to `true` , indicates that the previously-specified ACL
     *   configuration for queries in this workgroup should be ignored and set to null. If set to
     *   `false` or not set, and a value is present in the `AclConfiguration` of
     *   `ResultConfigurationUpdates` , the `AclConfiguration` in the workgroup's
     *   `ResultConfiguration` is updated with the new value. For more information, see
     *   [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html)
     *   .
     */
    public fun removeAclConfiguration(removeAclConfiguration: IResolvable) {
        cdkBuilder.removeAclConfiguration(removeAclConfiguration)
    }

    /**
     * @param removeEncryptionConfiguration If set to "true", indicates that the
     *   previously-specified encryption configuration (also known as the client-side setting) for
     *   queries in this workgroup should be ignored and set to null. If set to "false" or not set,
     *   and a value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the
     *   client-side setting), the EncryptionConfiguration in the workgroup's ResultConfiguration
     *   will be updated with the new value. For more information, see
     *   [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html)
     *   .
     */
    public fun removeEncryptionConfiguration(removeEncryptionConfiguration: Boolean) {
        cdkBuilder.removeEncryptionConfiguration(removeEncryptionConfiguration)
    }

    /**
     * @param removeEncryptionConfiguration If set to "true", indicates that the
     *   previously-specified encryption configuration (also known as the client-side setting) for
     *   queries in this workgroup should be ignored and set to null. If set to "false" or not set,
     *   and a value is present in the EncryptionConfiguration in ResultConfigurationUpdates (the
     *   client-side setting), the EncryptionConfiguration in the workgroup's ResultConfiguration
     *   will be updated with the new value. For more information, see
     *   [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html)
     *   .
     */
    public fun removeEncryptionConfiguration(removeEncryptionConfiguration: IResolvable) {
        cdkBuilder.removeEncryptionConfiguration(removeEncryptionConfiguration)
    }

    /**
     * @param removeExpectedBucketOwner If set to "true", removes the AWS account ID previously
     *   specified for `ResultConfiguration$ExpectedBucketOwner` . If set to "false" or not set, and
     *   a value is present in the `ExpectedBucketOwner` in `ResultConfigurationUpdates` (the
     *   client-side setting), the `ExpectedBucketOwner` in the workgroup's `ResultConfiguration` is
     *   updated with the new value. For more information, see
     *   [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html)
     *   .
     */
    public fun removeExpectedBucketOwner(removeExpectedBucketOwner: Boolean) {
        cdkBuilder.removeExpectedBucketOwner(removeExpectedBucketOwner)
    }

    /**
     * @param removeExpectedBucketOwner If set to "true", removes the AWS account ID previously
     *   specified for `ResultConfiguration$ExpectedBucketOwner` . If set to "false" or not set, and
     *   a value is present in the `ExpectedBucketOwner` in `ResultConfigurationUpdates` (the
     *   client-side setting), the `ExpectedBucketOwner` in the workgroup's `ResultConfiguration` is
     *   updated with the new value. For more information, see
     *   [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html)
     *   .
     */
    public fun removeExpectedBucketOwner(removeExpectedBucketOwner: IResolvable) {
        cdkBuilder.removeExpectedBucketOwner(removeExpectedBucketOwner)
    }

    /**
     * @param removeOutputLocation If set to "true", indicates that the previously-specified query
     *   results location (also known as a client-side setting) for queries in this workgroup should
     *   be ignored and set to null. If set to "false" or not set, and a value is present in the
     *   OutputLocation in ResultConfigurationUpdates (the client-side setting), the OutputLocation
     *   in the workgroup's ResultConfiguration will be updated with the new value. For more
     *   information, see
     *   [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html)
     *   .
     */
    public fun removeOutputLocation(removeOutputLocation: Boolean) {
        cdkBuilder.removeOutputLocation(removeOutputLocation)
    }

    /**
     * @param removeOutputLocation If set to "true", indicates that the previously-specified query
     *   results location (also known as a client-side setting) for queries in this workgroup should
     *   be ignored and set to null. If set to "false" or not set, and a value is present in the
     *   OutputLocation in ResultConfigurationUpdates (the client-side setting), the OutputLocation
     *   in the workgroup's ResultConfiguration will be updated with the new value. For more
     *   information, see
     *   [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html)
     *   .
     */
    public fun removeOutputLocation(removeOutputLocation: IResolvable) {
        cdkBuilder.removeOutputLocation(removeOutputLocation)
    }

    public fun build(): CfnWorkGroup.ResultConfigurationUpdatesProperty = cdkBuilder.build()
}
