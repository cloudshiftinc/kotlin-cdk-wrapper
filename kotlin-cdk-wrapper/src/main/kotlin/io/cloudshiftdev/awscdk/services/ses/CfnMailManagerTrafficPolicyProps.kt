@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnMailManagerTrafficPolicy`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnMailManagerTrafficPolicyProps cfnMailManagerTrafficPolicyProps =
 * CfnMailManagerTrafficPolicyProps.builder()
 * .defaultAction("defaultAction")
 * .policyStatements(List.of(PolicyStatementProperty.builder()
 * .action("action")
 * .conditions(List.of(PolicyConditionProperty.builder()
 * .booleanExpression(IngressBooleanExpressionProperty.builder()
 * .evaluate(IngressBooleanToEvaluateProperty.builder()
 * .analysis(IngressAnalysisProperty.builder()
 * .analyzer("analyzer")
 * .resultField("resultField")
 * .build())
 * .build())
 * .operator("operator")
 * .build())
 * .ipExpression(IngressIpv4ExpressionProperty.builder()
 * .evaluate(IngressIpToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .stringExpression(IngressStringExpressionProperty.builder()
 * .evaluate(IngressStringToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .tlsExpression(IngressTlsProtocolExpressionProperty.builder()
 * .evaluate(IngressTlsProtocolToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .value("value")
 * .build())
 * .build()))
 * .build()))
 * // the properties below are optional
 * .maxMessageSizeBytes(123)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .trafficPolicyName("trafficPolicyName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html)
 */
public interface CfnMailManagerTrafficPolicyProps {
  /**
   * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall
   * outside of (or not addressed by) the conditions of your policy statements.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-defaultaction)
   */
  public fun defaultAction(): String

  /**
   * The maximum message size in bytes of email which is allowed in by this traffic policy—anything
   * larger will be blocked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-maxmessagesizebytes)
   */
  public fun maxMessageSizeBytes(): Number? = unwrap(this).getMaxMessageSizeBytes()

  /**
   * Conditional statements for filtering email traffic.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-policystatements)
   */
  public fun policyStatements(): Any

  /**
   * The tags used to organize, track, or control access for the resource.
   *
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the policy.
   *
   * The policy name cannot exceed 64 characters and can only include alphanumeric characters,
   * dashes, and underscores.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-trafficpolicyname)
   */
  public fun trafficPolicyName(): String? = unwrap(this).getTrafficPolicyName()

  /**
   * A builder for [CfnMailManagerTrafficPolicyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultAction Default action instructs the traﬃc policy to either Allow or Deny
     * (block) messages that fall outside of (or not addressed by) the conditions of your policy
     * statements. 
     */
    public fun defaultAction(defaultAction: String)

    /**
     * @param maxMessageSizeBytes The maximum message size in bytes of email which is allowed in by
     * this traffic policy—anything larger will be blocked.
     */
    public fun maxMessageSizeBytes(maxMessageSizeBytes: Number)

    /**
     * @param policyStatements Conditional statements for filtering email traffic. 
     */
    public fun policyStatements(policyStatements: IResolvable)

    /**
     * @param policyStatements Conditional statements for filtering email traffic. 
     */
    public fun policyStatements(policyStatements: List<Any>)

    /**
     * @param policyStatements Conditional statements for filtering email traffic. 
     */
    public fun policyStatements(vararg policyStatements: Any)

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param trafficPolicyName The name of the policy.
     * The policy name cannot exceed 64 characters and can only include alphanumeric characters,
     * dashes, and underscores.
     */
    public fun trafficPolicyName(trafficPolicyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicyProps.Builder =
        software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicyProps.builder()

    /**
     * @param defaultAction Default action instructs the traﬃc policy to either Allow or Deny
     * (block) messages that fall outside of (or not addressed by) the conditions of your policy
     * statements. 
     */
    override fun defaultAction(defaultAction: String) {
      cdkBuilder.defaultAction(defaultAction)
    }

    /**
     * @param maxMessageSizeBytes The maximum message size in bytes of email which is allowed in by
     * this traffic policy—anything larger will be blocked.
     */
    override fun maxMessageSizeBytes(maxMessageSizeBytes: Number) {
      cdkBuilder.maxMessageSizeBytes(maxMessageSizeBytes)
    }

    /**
     * @param policyStatements Conditional statements for filtering email traffic. 
     */
    override fun policyStatements(policyStatements: IResolvable) {
      cdkBuilder.policyStatements(policyStatements.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param policyStatements Conditional statements for filtering email traffic. 
     */
    override fun policyStatements(policyStatements: List<Any>) {
      cdkBuilder.policyStatements(policyStatements.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param policyStatements Conditional statements for filtering email traffic. 
     */
    override fun policyStatements(vararg policyStatements: Any): Unit =
        policyStatements(policyStatements.toList())

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for the resource.
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param trafficPolicyName The name of the policy.
     * The policy name cannot exceed 64 characters and can only include alphanumeric characters,
     * dashes, and underscores.
     */
    override fun trafficPolicyName(trafficPolicyName: String) {
      cdkBuilder.trafficPolicyName(trafficPolicyName)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicyProps,
  ) : CdkObject(cdkObject),
      CfnMailManagerTrafficPolicyProps {
    /**
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall
     * outside of (or not addressed by) the conditions of your policy statements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-defaultaction)
     */
    override fun defaultAction(): String = unwrap(this).getDefaultAction()

    /**
     * The maximum message size in bytes of email which is allowed in by this traffic
     * policy—anything larger will be blocked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-maxmessagesizebytes)
     */
    override fun maxMessageSizeBytes(): Number? = unwrap(this).getMaxMessageSizeBytes()

    /**
     * Conditional statements for filtering email traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-policystatements)
     */
    override fun policyStatements(): Any = unwrap(this).getPolicyStatements()

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the policy.
     *
     * The policy name cannot exceed 64 characters and can only include alphanumeric characters,
     * dashes, and underscores.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-trafficpolicyname)
     */
    override fun trafficPolicyName(): String? = unwrap(this).getTrafficPolicyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnMailManagerTrafficPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicyProps):
        CfnMailManagerTrafficPolicyProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnMailManagerTrafficPolicyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerTrafficPolicyProps):
        software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicyProps
  }
}
