@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnBucket`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
 * CfnBucketProps cfnBucketProps = CfnBucketProps.builder()
 * .bucketName("bucketName")
 * .bundleId("bundleId")
 * // the properties below are optional
 * .accessRules(AccessRulesProperty.builder()
 * .allowPublicOverrides(false)
 * .objectAccess("objectAccess")
 * .build())
 * .objectVersioning(false)
 * .readOnlyAccessAccounts(List.of("readOnlyAccessAccounts"))
 * .resourcesReceivingAccess(List.of("resourcesReceivingAccess"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html)
 */
public interface CfnBucketProps {
  /**
   * An object that describes the access rules for the bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-accessrules)
   */
  public fun accessRules(): Any? = unwrap(this).getAccessRules()

  /**
   * The name of the bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-bucketname)
   */
  public fun bucketName(): String

  /**
   * The bundle ID for the bucket (for example, `small_1_0` ).
   *
   * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a
   * bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-bundleid)
   */
  public fun bundleId(): String

  /**
   * Indicates whether object versioning is enabled for the bucket.
   *
   * The following options can be configured:
   *
   * * `Enabled` - Object versioning is enabled.
   * * `Suspended` - Object versioning was previously enabled but is currently suspended. Existing
   * object versions are retained.
   * * `NeverEnabled` - Object versioning has never been enabled.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-objectversioning)
   */
  public fun objectVersioning(): Any? = unwrap(this).getObjectVersioning()

  /**
   * An array of AWS account IDs that have read-only access to the bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-readonlyaccessaccounts)
   */
  public fun readOnlyAccessAccounts(): List<String> = unwrap(this).getReadOnlyAccessAccounts() ?:
      emptyList()

  /**
   * An array of Lightsail instances that have access to the bucket.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-resourcesreceivingaccess)
   */
  public fun resourcesReceivingAccess(): List<String> = unwrap(this).getResourcesReceivingAccess()
      ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnBucketProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessRules An object that describes the access rules for the bucket.
     */
    public fun accessRules(accessRules: IResolvable)

    /**
     * @param accessRules An object that describes the access rules for the bucket.
     */
    public fun accessRules(accessRules: CfnBucket.AccessRulesProperty)

    /**
     * @param accessRules An object that describes the access rules for the bucket.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea1463723c6b10addbe35f14de5ab5dab76c04e4ec31bad7ba73dad0e06ec143")
    public fun accessRules(accessRules: CfnBucket.AccessRulesProperty.Builder.() -> Unit)

    /**
     * @param bucketName The name of the bucket. 
     */
    public fun bucketName(bucketName: String)

    /**
     * @param bundleId The bundle ID for the bucket (for example, `small_1_0` ). 
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a
     * bucket.
     */
    public fun bundleId(bundleId: String)

    /**
     * @param objectVersioning Indicates whether object versioning is enabled for the bucket.
     * The following options can be configured:
     *
     * * `Enabled` - Object versioning is enabled.
     * * `Suspended` - Object versioning was previously enabled but is currently suspended. Existing
     * object versions are retained.
     * * `NeverEnabled` - Object versioning has never been enabled.
     */
    public fun objectVersioning(objectVersioning: Boolean)

    /**
     * @param objectVersioning Indicates whether object versioning is enabled for the bucket.
     * The following options can be configured:
     *
     * * `Enabled` - Object versioning is enabled.
     * * `Suspended` - Object versioning was previously enabled but is currently suspended. Existing
     * object versions are retained.
     * * `NeverEnabled` - Object versioning has never been enabled.
     */
    public fun objectVersioning(objectVersioning: IResolvable)

    /**
     * @param readOnlyAccessAccounts An array of AWS account IDs that have read-only access to the
     * bucket.
     */
    public fun readOnlyAccessAccounts(readOnlyAccessAccounts: List<String>)

    /**
     * @param readOnlyAccessAccounts An array of AWS account IDs that have read-only access to the
     * bucket.
     */
    public fun readOnlyAccessAccounts(vararg readOnlyAccessAccounts: String)

    /**
     * @param resourcesReceivingAccess An array of Lightsail instances that have access to the
     * bucket.
     */
    public fun resourcesReceivingAccess(resourcesReceivingAccess: List<String>)

    /**
     * @param resourcesReceivingAccess An array of Lightsail instances that have access to the
     * bucket.
     */
    public fun resourcesReceivingAccess(vararg resourcesReceivingAccess: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnBucketProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnBucketProps.builder()

    /**
     * @param accessRules An object that describes the access rules for the bucket.
     */
    override fun accessRules(accessRules: IResolvable) {
      cdkBuilder.accessRules(accessRules.let(IResolvable::unwrap))
    }

    /**
     * @param accessRules An object that describes the access rules for the bucket.
     */
    override fun accessRules(accessRules: CfnBucket.AccessRulesProperty) {
      cdkBuilder.accessRules(accessRules.let(CfnBucket.AccessRulesProperty::unwrap))
    }

    /**
     * @param accessRules An object that describes the access rules for the bucket.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea1463723c6b10addbe35f14de5ab5dab76c04e4ec31bad7ba73dad0e06ec143")
    override fun accessRules(accessRules: CfnBucket.AccessRulesProperty.Builder.() -> Unit): Unit =
        accessRules(CfnBucket.AccessRulesProperty(accessRules))

    /**
     * @param bucketName The name of the bucket. 
     */
    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    /**
     * @param bundleId The bundle ID for the bucket (for example, `small_1_0` ). 
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a
     * bucket.
     */
    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    /**
     * @param objectVersioning Indicates whether object versioning is enabled for the bucket.
     * The following options can be configured:
     *
     * * `Enabled` - Object versioning is enabled.
     * * `Suspended` - Object versioning was previously enabled but is currently suspended. Existing
     * object versions are retained.
     * * `NeverEnabled` - Object versioning has never been enabled.
     */
    override fun objectVersioning(objectVersioning: Boolean) {
      cdkBuilder.objectVersioning(objectVersioning)
    }

    /**
     * @param objectVersioning Indicates whether object versioning is enabled for the bucket.
     * The following options can be configured:
     *
     * * `Enabled` - Object versioning is enabled.
     * * `Suspended` - Object versioning was previously enabled but is currently suspended. Existing
     * object versions are retained.
     * * `NeverEnabled` - Object versioning has never been enabled.
     */
    override fun objectVersioning(objectVersioning: IResolvable) {
      cdkBuilder.objectVersioning(objectVersioning.let(IResolvable::unwrap))
    }

    /**
     * @param readOnlyAccessAccounts An array of AWS account IDs that have read-only access to the
     * bucket.
     */
    override fun readOnlyAccessAccounts(readOnlyAccessAccounts: List<String>) {
      cdkBuilder.readOnlyAccessAccounts(readOnlyAccessAccounts)
    }

    /**
     * @param readOnlyAccessAccounts An array of AWS account IDs that have read-only access to the
     * bucket.
     */
    override fun readOnlyAccessAccounts(vararg readOnlyAccessAccounts: String): Unit =
        readOnlyAccessAccounts(readOnlyAccessAccounts.toList())

    /**
     * @param resourcesReceivingAccess An array of Lightsail instances that have access to the
     * bucket.
     */
    override fun resourcesReceivingAccess(resourcesReceivingAccess: List<String>) {
      cdkBuilder.resourcesReceivingAccess(resourcesReceivingAccess)
    }

    /**
     * @param resourcesReceivingAccess An array of Lightsail instances that have access to the
     * bucket.
     */
    override fun resourcesReceivingAccess(vararg resourcesReceivingAccess: String): Unit =
        resourcesReceivingAccess(resourcesReceivingAccess.toList())

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnBucketProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnBucketProps,
  ) : CdkObject(cdkObject), CfnBucketProps {
    /**
     * An object that describes the access rules for the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-accessrules)
     */
    override fun accessRules(): Any? = unwrap(this).getAccessRules()

    /**
     * The name of the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-bucketname)
     */
    override fun bucketName(): String = unwrap(this).getBucketName()

    /**
     * The bundle ID for the bucket (for example, `small_1_0` ).
     *
     * A bucket bundle specifies the monthly cost, storage space, and data transfer quota for a
     * bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-bundleid)
     */
    override fun bundleId(): String = unwrap(this).getBundleId()

    /**
     * Indicates whether object versioning is enabled for the bucket.
     *
     * The following options can be configured:
     *
     * * `Enabled` - Object versioning is enabled.
     * * `Suspended` - Object versioning was previously enabled but is currently suspended. Existing
     * object versions are retained.
     * * `NeverEnabled` - Object versioning has never been enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-objectversioning)
     */
    override fun objectVersioning(): Any? = unwrap(this).getObjectVersioning()

    /**
     * An array of AWS account IDs that have read-only access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-readonlyaccessaccounts)
     */
    override fun readOnlyAccessAccounts(): List<String> = unwrap(this).getReadOnlyAccessAccounts()
        ?: emptyList()

    /**
     * An array of Lightsail instances that have access to the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-resourcesreceivingaccess)
     */
    override fun resourcesReceivingAccess(): List<String> =
        unwrap(this).getResourcesReceivingAccess() ?: emptyList()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-bucket.html#cfn-lightsail-bucket-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBucketProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnBucketProps):
        CfnBucketProps = CdkObjectWrappers.wrap(cdkObject) as CfnBucketProps

    internal fun unwrap(wrapped: CfnBucketProps):
        software.amazon.awscdk.services.lightsail.CfnBucketProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lightsail.CfnBucketProps
  }
}
