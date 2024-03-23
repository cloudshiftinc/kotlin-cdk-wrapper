@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

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
 * Properties for defining a `CfnVerifiedAccessGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * CfnVerifiedAccessGroupProps cfnVerifiedAccessGroupProps = CfnVerifiedAccessGroupProps.builder()
 * .verifiedAccessInstanceId("verifiedAccessInstanceId")
 * // the properties below are optional
 * .description("description")
 * .policyDocument("policyDocument")
 * .policyEnabled(false)
 * .sseSpecification(SseSpecificationProperty.builder()
 * .customerManagedKeyEnabled(false)
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html)
 */
public interface CfnVerifiedAccessGroupProps {
  /**
   * A description for the AWS Verified Access group.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Verified Access policy document.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policydocument)
   */
  public fun policyDocument(): String? = unwrap(this).getPolicyDocument()

  /**
   * The status of the Verified Access policy.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policyenabled)
   */
  public fun policyEnabled(): Any? = unwrap(this).getPolicyEnabled()

  /**
   * The options for additional server side encryption.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-ssespecification)
   */
  public fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

  /**
   * The tags.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The ID of the AWS Verified Access instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-verifiedaccessinstanceid)
   */
  public fun verifiedAccessInstanceId(): String

  /**
   * A builder for [CfnVerifiedAccessGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description for the AWS Verified Access group.
     */
    public fun description(description: String)

    /**
     * @param policyDocument The Verified Access policy document.
     */
    public fun policyDocument(policyDocument: String)

    /**
     * @param policyEnabled The status of the Verified Access policy.
     */
    public fun policyEnabled(policyEnabled: Boolean)

    /**
     * @param policyEnabled The status of the Verified Access policy.
     */
    public fun policyEnabled(policyEnabled: IResolvable)

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    public fun sseSpecification(sseSpecification: IResolvable)

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    public fun sseSpecification(sseSpecification: CfnVerifiedAccessGroup.SseSpecificationProperty)

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72d0fa87be31d717f6830591a15cd1bf98005463dd55f6f9d6b24098e1ba89ce")
    public
        fun sseSpecification(sseSpecification: CfnVerifiedAccessGroup.SseSpecificationProperty.Builder.() -> Unit)

    /**
     * @param tags The tags.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param verifiedAccessInstanceId The ID of the AWS Verified Access instance. 
     */
    public fun verifiedAccessInstanceId(verifiedAccessInstanceId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps.Builder
        = software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps.builder()

    /**
     * @param description A description for the AWS Verified Access group.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param policyDocument The Verified Access policy document.
     */
    override fun policyDocument(policyDocument: String) {
      cdkBuilder.policyDocument(policyDocument)
    }

    /**
     * @param policyEnabled The status of the Verified Access policy.
     */
    override fun policyEnabled(policyEnabled: Boolean) {
      cdkBuilder.policyEnabled(policyEnabled)
    }

    /**
     * @param policyEnabled The status of the Verified Access policy.
     */
    override fun policyEnabled(policyEnabled: IResolvable) {
      cdkBuilder.policyEnabled(policyEnabled.let(IResolvable::unwrap))
    }

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    override fun sseSpecification(sseSpecification: IResolvable) {
      cdkBuilder.sseSpecification(sseSpecification.let(IResolvable::unwrap))
    }

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    override
        fun sseSpecification(sseSpecification: CfnVerifiedAccessGroup.SseSpecificationProperty) {
      cdkBuilder.sseSpecification(sseSpecification.let(CfnVerifiedAccessGroup.SseSpecificationProperty::unwrap))
    }

    /**
     * @param sseSpecification The options for additional server side encryption.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("72d0fa87be31d717f6830591a15cd1bf98005463dd55f6f9d6b24098e1ba89ce")
    override
        fun sseSpecification(sseSpecification: CfnVerifiedAccessGroup.SseSpecificationProperty.Builder.() -> Unit):
        Unit = sseSpecification(CfnVerifiedAccessGroup.SseSpecificationProperty(sseSpecification))

    /**
     * @param tags The tags.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param verifiedAccessInstanceId The ID of the AWS Verified Access instance. 
     */
    override fun verifiedAccessInstanceId(verifiedAccessInstanceId: String) {
      cdkBuilder.verifiedAccessInstanceId(verifiedAccessInstanceId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps,
  ) : CdkObject(cdkObject), CfnVerifiedAccessGroupProps {
    /**
     * A description for the AWS Verified Access group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Verified Access policy document.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policydocument)
     */
    override fun policyDocument(): String? = unwrap(this).getPolicyDocument()

    /**
     * The status of the Verified Access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-policyenabled)
     */
    override fun policyEnabled(): Any? = unwrap(this).getPolicyEnabled()

    /**
     * The options for additional server side encryption.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-ssespecification)
     */
    override fun sseSpecification(): Any? = unwrap(this).getSseSpecification()

    /**
     * The tags.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The ID of the AWS Verified Access instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-verifiedaccessgroup.html#cfn-ec2-verifiedaccessgroup-verifiedaccessinstanceid)
     */
    override fun verifiedAccessInstanceId(): String = unwrap(this).getVerifiedAccessInstanceId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnVerifiedAccessGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps):
        CfnVerifiedAccessGroupProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnVerifiedAccessGroupProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnVerifiedAccessGroupProps):
        software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnVerifiedAccessGroupProps
  }
}
