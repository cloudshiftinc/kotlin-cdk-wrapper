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

package io.cloudshiftdev.awscdkdsl.services.s3

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3.CfnAccessGrant
import software.amazon.awscdk.services.s3.CfnAccessGrantProps

/**
 * Properties for defining a `CfnAccessGrant`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.s3.*;
 * CfnAccessGrantProps cfnAccessGrantProps = CfnAccessGrantProps.builder()
 * .accessGrantsLocationId("accessGrantsLocationId")
 * .grantee(GranteeProperty.builder()
 * .granteeIdentifier("granteeIdentifier")
 * .granteeType("granteeType")
 * .build())
 * .permission("permission")
 * // the properties below are optional
 * .accessGrantsLocationConfiguration(AccessGrantsLocationConfigurationProperty.builder()
 * .s3SubPrefix("s3SubPrefix")
 * .build())
 * .applicationArn("applicationArn")
 * .s3PrefixType("s3PrefixType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3-accessgrant.html)
 */
@CdkDslMarker
public class CfnAccessGrantPropsDsl {
    private val cdkBuilder: CfnAccessGrantProps.Builder = CfnAccessGrantProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * @param accessGrantsLocationConfiguration The configuration options of the grant location. The
     *   grant location is the S3 path to the data to which you are granting access. It contains the
     *   `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     *   location scope of the registered location.
     */
    public fun accessGrantsLocationConfiguration(accessGrantsLocationConfiguration: IResolvable) {
        cdkBuilder.accessGrantsLocationConfiguration(accessGrantsLocationConfiguration)
    }

    /**
     * @param accessGrantsLocationConfiguration The configuration options of the grant location. The
     *   grant location is the S3 path to the data to which you are granting access. It contains the
     *   `S3SubPrefix` field. The grant scope is the result of appending the subprefix to the
     *   location scope of the registered location.
     */
    public fun accessGrantsLocationConfiguration(
        accessGrantsLocationConfiguration: CfnAccessGrant.AccessGrantsLocationConfigurationProperty
    ) {
        cdkBuilder.accessGrantsLocationConfiguration(accessGrantsLocationConfiguration)
    }

    /**
     * @param accessGrantsLocationId The ID of the registered location to which you are granting
     *   access. S3 Access Grants assigns this ID when you register the location. S3 Access Grants
     *   assigns the ID `default` to the default location `s3://` and assigns an auto-generated ID
     *   to other locations that you register.
     */
    public fun accessGrantsLocationId(accessGrantsLocationId: String) {
        cdkBuilder.accessGrantsLocationId(accessGrantsLocationId)
    }

    /**
     * @param applicationArn The Amazon Resource Name (ARN) of an AWS IAM Identity Center
     *   application associated with your Identity Center instance. If the grant includes an
     *   application ARN, the grantee can only access the S3 data through this application.
     */
    public fun applicationArn(applicationArn: String) {
        cdkBuilder.applicationArn(applicationArn)
    }

    /**
     * @param grantee The user, group, or role to which you are granting access. You can grant
     *   access to an IAM user or role. If you have added your corporate directory to AWS IAM
     *   Identity Center and associated your Identity Center instance with your S3 Access Grants
     *   instance, the grantee can also be a corporate directory user or group.
     */
    public fun grantee(grantee: IResolvable) {
        cdkBuilder.grantee(grantee)
    }

    /**
     * @param grantee The user, group, or role to which you are granting access. You can grant
     *   access to an IAM user or role. If you have added your corporate directory to AWS IAM
     *   Identity Center and associated your Identity Center instance with your S3 Access Grants
     *   instance, the grantee can also be a corporate directory user or group.
     */
    public fun grantee(grantee: CfnAccessGrant.GranteeProperty) {
        cdkBuilder.grantee(grantee)
    }

    /**
     * @param permission The type of access that you are granting to your S3 data, which can be set
     *   to one of the following values: - `READ` – Grant read-only access to the S3 data.
     * * `WRITE` – Grant write-only access to the S3 data.
     * * `READWRITE` – Grant both read and write access to the S3 data.
     */
    public fun permission(permission: String) {
        cdkBuilder.permission(permission)
    }

    /**
     * @param s3PrefixType The type of `S3SubPrefix` . The only possible value is `Object` . Pass
     *   this value if the access grant scope is an object. Do not pass this value if the access
     *   grant scope is a bucket or a bucket and a prefix.
     */
    public fun s3PrefixType(s3PrefixType: String) {
        cdkBuilder.s3PrefixType(s3PrefixType)
    }

    /**
     * @param tags The AWS resource tags that you are adding to the access grant. Each tag is a
     *   label consisting of a user-defined key and value. Tags can help you manage, identify,
     *   organize, search for, and filter resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags The AWS resource tags that you are adding to the access grant. Each tag is a
     *   label consisting of a user-defined key and value. Tags can help you manage, identify,
     *   organize, search for, and filter resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAccessGrantProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
