@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ses

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Resource to create a traffic policy for a Mail Manager ingress endpoint which contains policy
 * statements used to evaluate whether incoming emails should be allowed or denied.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ses.*;
 * CfnMailManagerTrafficPolicy cfnMailManagerTrafficPolicy =
 * CfnMailManagerTrafficPolicy.Builder.create(this, "MyCfnMailManagerTrafficPolicy")
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
 * .isInAddressList(IngressIsInAddressListProperty.builder()
 * .addressLists(List.of("addressLists"))
 * .attribute("attribute")
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
 * .ipv6Expression(IngressIpv6ExpressionProperty.builder()
 * .evaluate(IngressIpv6ToEvaluateProperty.builder()
 * .attribute("attribute")
 * .build())
 * .operator("operator")
 * .values(List.of("values"))
 * .build())
 * .stringExpression(IngressStringExpressionProperty.builder()
 * .evaluate(IngressStringToEvaluateProperty.builder()
 * .analysis(IngressAnalysisProperty.builder()
 * .analyzer("analyzer")
 * .resultField("resultField")
 * .build())
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
public open class CfnMailManagerTrafficPolicy(
  cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerTrafficPolicyProps,
  ) :
      this(software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnMailManagerTrafficPolicyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnMailManagerTrafficPolicyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnMailManagerTrafficPolicyProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the traffic policy resource.
   */
  public open fun attrTrafficPolicyArn(): String = unwrap(this).getAttrTrafficPolicyArn()

  /**
   * The identifier of the traffic policy resource.
   */
  public open fun attrTrafficPolicyId(): String = unwrap(this).getAttrTrafficPolicyId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall
   * outside of (or not addressed by) the conditions of your policy statements.
   */
  public open fun defaultAction(): String = unwrap(this).getDefaultAction()

  /**
   * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall
   * outside of (or not addressed by) the conditions of your policy statements.
   */
  public open fun defaultAction(`value`: String) {
    unwrap(this).setDefaultAction(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The maximum message size in bytes of email which is allowed in by this traffic policy—anything
   * larger will be blocked.
   */
  public open fun maxMessageSizeBytes(): Number? = unwrap(this).getMaxMessageSizeBytes()

  /**
   * The maximum message size in bytes of email which is allowed in by this traffic policy—anything
   * larger will be blocked.
   */
  public open fun maxMessageSizeBytes(`value`: Number) {
    unwrap(this).setMaxMessageSizeBytes(`value`)
  }

  /**
   * Conditional statements for filtering email traffic.
   */
  public open fun policyStatements(): Any = unwrap(this).getPolicyStatements()

  /**
   * Conditional statements for filtering email traffic.
   */
  public open fun policyStatements(`value`: IResolvable) {
    unwrap(this).setPolicyStatements(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Conditional statements for filtering email traffic.
   */
  public open fun policyStatements(`value`: List<Any>) {
    unwrap(this).setPolicyStatements(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Conditional statements for filtering email traffic.
   */
  public open fun policyStatements(vararg `value`: Any): Unit = policyStatements(`value`.toList())

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The tags used to organize, track, or control access for the resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The name of the policy.
   */
  public open fun trafficPolicyName(): String? = unwrap(this).getTrafficPolicyName()

  /**
   * The name of the policy.
   */
  public open fun trafficPolicyName(`value`: String) {
    unwrap(this).setTrafficPolicyName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ses.CfnMailManagerTrafficPolicy].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall
     * outside of (or not addressed by) the conditions of your policy statements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-defaultaction)
     * @param defaultAction Default action instructs the traﬃc policy to either Allow or Deny
     * (block) messages that fall outside of (or not addressed by) the conditions of your policy
     * statements. 
     */
    public fun defaultAction(defaultAction: String)

    /**
     * The maximum message size in bytes of email which is allowed in by this traffic
     * policy—anything larger will be blocked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-maxmessagesizebytes)
     * @param maxMessageSizeBytes The maximum message size in bytes of email which is allowed in by
     * this traffic policy—anything larger will be blocked. 
     */
    public fun maxMessageSizeBytes(maxMessageSizeBytes: Number)

    /**
     * Conditional statements for filtering email traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-policystatements)
     * @param policyStatements Conditional statements for filtering email traffic. 
     */
    public fun policyStatements(policyStatements: IResolvable)

    /**
     * Conditional statements for filtering email traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-policystatements)
     * @param policyStatements Conditional statements for filtering email traffic. 
     */
    public fun policyStatements(policyStatements: List<Any>)

    /**
     * Conditional statements for filtering email traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-policystatements)
     * @param policyStatements Conditional statements for filtering email traffic. 
     */
    public fun policyStatements(vararg policyStatements: Any)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the policy.
     *
     * The policy name cannot exceed 64 characters and can only include alphanumeric characters,
     * dashes, and underscores.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-trafficpolicyname)
     * @param trafficPolicyName The name of the policy. 
     */
    public fun trafficPolicyName(trafficPolicyName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.Builder
        = software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.Builder.create(scope, id)

    /**
     * Default action instructs the traﬃc policy to either Allow or Deny (block) messages that fall
     * outside of (or not addressed by) the conditions of your policy statements.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-defaultaction)
     * @param defaultAction Default action instructs the traﬃc policy to either Allow or Deny
     * (block) messages that fall outside of (or not addressed by) the conditions of your policy
     * statements. 
     */
    override fun defaultAction(defaultAction: String) {
      cdkBuilder.defaultAction(defaultAction)
    }

    /**
     * The maximum message size in bytes of email which is allowed in by this traffic
     * policy—anything larger will be blocked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-maxmessagesizebytes)
     * @param maxMessageSizeBytes The maximum message size in bytes of email which is allowed in by
     * this traffic policy—anything larger will be blocked. 
     */
    override fun maxMessageSizeBytes(maxMessageSizeBytes: Number) {
      cdkBuilder.maxMessageSizeBytes(maxMessageSizeBytes)
    }

    /**
     * Conditional statements for filtering email traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-policystatements)
     * @param policyStatements Conditional statements for filtering email traffic. 
     */
    override fun policyStatements(policyStatements: IResolvable) {
      cdkBuilder.policyStatements(policyStatements.let(IResolvable.Companion::unwrap))
    }

    /**
     * Conditional statements for filtering email traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-policystatements)
     * @param policyStatements Conditional statements for filtering email traffic. 
     */
    override fun policyStatements(policyStatements: List<Any>) {
      cdkBuilder.policyStatements(policyStatements.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Conditional statements for filtering email traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-policystatements)
     * @param policyStatements Conditional statements for filtering email traffic. 
     */
    override fun policyStatements(vararg policyStatements: Any): Unit =
        policyStatements(policyStatements.toList())

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The tags used to organize, track, or control access for the resource.
     *
     * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-tags)
     * @param tags The tags used to organize, track, or control access for the resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the policy.
     *
     * The policy name cannot exceed 64 characters and can only include alphanumeric characters,
     * dashes, and underscores.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-mailmanagertrafficpolicy.html#cfn-ses-mailmanagertrafficpolicy-trafficpolicyname)
     * @param trafficPolicyName The name of the policy. 
     */
    override fun trafficPolicyName(trafficPolicyName: String) {
      cdkBuilder.trafficPolicyName(trafficPolicyName)
    }

    public fun build(): software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnMailManagerTrafficPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnMailManagerTrafficPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy):
        CfnMailManagerTrafficPolicy = CfnMailManagerTrafficPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnMailManagerTrafficPolicy):
        software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy = wrapped.cdkObject as
        software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy
  }

  /**
   * The Add On ARN and its returned value that is evaluated in a policy statement's conditional
   * expression to either deny or block the incoming email.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressAnalysisProperty ingressAnalysisProperty = IngressAnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressanalysis.html)
   */
  public interface IngressAnalysisProperty {
    /**
     * The Amazon Resource Name (ARN) of an Add On.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressanalysis.html#cfn-ses-mailmanagertrafficpolicy-ingressanalysis-analyzer)
     */
    public fun analyzer(): String

    /**
     * The returned value from an Add On.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressanalysis.html#cfn-ses-mailmanagertrafficpolicy-ingressanalysis-resultfield)
     */
    public fun resultField(): String

    /**
     * A builder for [IngressAnalysisProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param analyzer The Amazon Resource Name (ARN) of an Add On. 
       */
      public fun analyzer(analyzer: String)

      /**
       * @param resultField The returned value from an Add On. 
       */
      public fun resultField(resultField: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressAnalysisProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressAnalysisProperty.builder()

      /**
       * @param analyzer The Amazon Resource Name (ARN) of an Add On. 
       */
      override fun analyzer(analyzer: String) {
        cdkBuilder.analyzer(analyzer)
      }

      /**
       * @param resultField The returned value from an Add On. 
       */
      override fun resultField(resultField: String) {
        cdkBuilder.resultField(resultField)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressAnalysisProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressAnalysisProperty,
    ) : CdkObject(cdkObject),
        IngressAnalysisProperty {
      /**
       * The Amazon Resource Name (ARN) of an Add On.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressanalysis.html#cfn-ses-mailmanagertrafficpolicy-ingressanalysis-analyzer)
       */
      override fun analyzer(): String = unwrap(this).getAnalyzer()

      /**
       * The returned value from an Add On.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressanalysis.html#cfn-ses-mailmanagertrafficpolicy-ingressanalysis-resultfield)
       */
      override fun resultField(): String = unwrap(this).getResultField()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressAnalysisProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressAnalysisProperty):
          IngressAnalysisProperty = CdkObjectWrappers.wrap(cdkObject) as? IngressAnalysisProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressAnalysisProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressAnalysisProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressAnalysisProperty
    }
  }

  /**
   * The structure for a boolean condition matching on the incoming mail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressBooleanExpressionProperty ingressBooleanExpressionProperty =
   * IngressBooleanExpressionProperty.builder()
   * .evaluate(IngressBooleanToEvaluateProperty.builder()
   * .analysis(IngressAnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .isInAddressList(IngressIsInAddressListProperty.builder()
   * .addressLists(List.of("addressLists"))
   * .attribute("attribute")
   * .build())
   * .build())
   * .operator("operator")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressbooleanexpression.html)
   */
  public interface IngressBooleanExpressionProperty {
    /**
     * The operand on which to perform a boolean condition operation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressbooleanexpression.html#cfn-ses-mailmanagertrafficpolicy-ingressbooleanexpression-evaluate)
     */
    public fun evaluate(): Any

    /**
     * The matching operator for a boolean condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressbooleanexpression.html#cfn-ses-mailmanagertrafficpolicy-ingressbooleanexpression-operator)
     */
    public fun `operator`(): String

    /**
     * A builder for [IngressBooleanExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param evaluate The operand on which to perform a boolean condition operation. 
       */
      public fun evaluate(evaluate: IResolvable)

      /**
       * @param evaluate The operand on which to perform a boolean condition operation. 
       */
      public fun evaluate(evaluate: IngressBooleanToEvaluateProperty)

      /**
       * @param evaluate The operand on which to perform a boolean condition operation. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("059645feae1460076ece80513614777a20fac0a948125ff0098af688f59fbd84")
      public fun evaluate(evaluate: IngressBooleanToEvaluateProperty.Builder.() -> Unit)

      /**
       * @param operator The matching operator for a boolean condition expression. 
       */
      public fun `operator`(`operator`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanExpressionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanExpressionProperty.builder()

      /**
       * @param evaluate The operand on which to perform a boolean condition operation. 
       */
      override fun evaluate(evaluate: IResolvable) {
        cdkBuilder.evaluate(evaluate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param evaluate The operand on which to perform a boolean condition operation. 
       */
      override fun evaluate(evaluate: IngressBooleanToEvaluateProperty) {
        cdkBuilder.evaluate(evaluate.let(IngressBooleanToEvaluateProperty.Companion::unwrap))
      }

      /**
       * @param evaluate The operand on which to perform a boolean condition operation. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("059645feae1460076ece80513614777a20fac0a948125ff0098af688f59fbd84")
      override fun evaluate(evaluate: IngressBooleanToEvaluateProperty.Builder.() -> Unit): Unit =
          evaluate(IngressBooleanToEvaluateProperty(evaluate))

      /**
       * @param operator The matching operator for a boolean condition expression. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanExpressionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanExpressionProperty,
    ) : CdkObject(cdkObject),
        IngressBooleanExpressionProperty {
      /**
       * The operand on which to perform a boolean condition operation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressbooleanexpression.html#cfn-ses-mailmanagertrafficpolicy-ingressbooleanexpression-evaluate)
       */
      override fun evaluate(): Any = unwrap(this).getEvaluate()

      /**
       * The matching operator for a boolean condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressbooleanexpression.html#cfn-ses-mailmanagertrafficpolicy-ingressbooleanexpression-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressBooleanExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanExpressionProperty):
          IngressBooleanExpressionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressBooleanExpressionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressBooleanExpressionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanExpressionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanExpressionProperty
    }
  }

  /**
   * The union type representing the allowed types of operands for a boolean condition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressBooleanToEvaluateProperty ingressBooleanToEvaluateProperty =
   * IngressBooleanToEvaluateProperty.builder()
   * .analysis(IngressAnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .isInAddressList(IngressIsInAddressListProperty.builder()
   * .addressLists(List.of("addressLists"))
   * .attribute("attribute")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressbooleantoevaluate.html)
   */
  public interface IngressBooleanToEvaluateProperty {
    /**
     * The structure type for a boolean condition stating the Add On ARN and its returned value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressbooleantoevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingressbooleantoevaluate-analysis)
     */
    public fun analysis(): Any? = unwrap(this).getAnalysis()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressbooleantoevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingressbooleantoevaluate-isinaddresslist)
     */
    public fun isInAddressList(): Any? = unwrap(this).getIsInAddressList()

    /**
     * A builder for [IngressBooleanToEvaluateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param analysis The structure type for a boolean condition stating the Add On ARN and its
       * returned value.
       */
      public fun analysis(analysis: IResolvable)

      /**
       * @param analysis The structure type for a boolean condition stating the Add On ARN and its
       * returned value.
       */
      public fun analysis(analysis: IngressAnalysisProperty)

      /**
       * @param analysis The structure type for a boolean condition stating the Add On ARN and its
       * returned value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c970d1bc25b19e527529260ea28764e9824b9eb7d3aedca77227abd4ed388536")
      public fun analysis(analysis: IngressAnalysisProperty.Builder.() -> Unit)

      /**
       * @param isInAddressList the value to be set.
       */
      public fun isInAddressList(isInAddressList: IResolvable)

      /**
       * @param isInAddressList the value to be set.
       */
      public fun isInAddressList(isInAddressList: IngressIsInAddressListProperty)

      /**
       * @param isInAddressList the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("229d63b1c17fe8d779e468bde8afe1d9330d3631370bc9465be393c56a6c0e84")
      public fun isInAddressList(isInAddressList: IngressIsInAddressListProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanToEvaluateProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanToEvaluateProperty.builder()

      /**
       * @param analysis The structure type for a boolean condition stating the Add On ARN and its
       * returned value.
       */
      override fun analysis(analysis: IResolvable) {
        cdkBuilder.analysis(analysis.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param analysis The structure type for a boolean condition stating the Add On ARN and its
       * returned value.
       */
      override fun analysis(analysis: IngressAnalysisProperty) {
        cdkBuilder.analysis(analysis.let(IngressAnalysisProperty.Companion::unwrap))
      }

      /**
       * @param analysis The structure type for a boolean condition stating the Add On ARN and its
       * returned value.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c970d1bc25b19e527529260ea28764e9824b9eb7d3aedca77227abd4ed388536")
      override fun analysis(analysis: IngressAnalysisProperty.Builder.() -> Unit): Unit =
          analysis(IngressAnalysisProperty(analysis))

      /**
       * @param isInAddressList the value to be set.
       */
      override fun isInAddressList(isInAddressList: IResolvable) {
        cdkBuilder.isInAddressList(isInAddressList.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param isInAddressList the value to be set.
       */
      override fun isInAddressList(isInAddressList: IngressIsInAddressListProperty) {
        cdkBuilder.isInAddressList(isInAddressList.let(IngressIsInAddressListProperty.Companion::unwrap))
      }

      /**
       * @param isInAddressList the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("229d63b1c17fe8d779e468bde8afe1d9330d3631370bc9465be393c56a6c0e84")
      override
          fun isInAddressList(isInAddressList: IngressIsInAddressListProperty.Builder.() -> Unit):
          Unit = isInAddressList(IngressIsInAddressListProperty(isInAddressList))

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanToEvaluateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanToEvaluateProperty,
    ) : CdkObject(cdkObject),
        IngressBooleanToEvaluateProperty {
      /**
       * The structure type for a boolean condition stating the Add On ARN and its returned value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressbooleantoevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingressbooleantoevaluate-analysis)
       */
      override fun analysis(): Any? = unwrap(this).getAnalysis()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressbooleantoevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingressbooleantoevaluate-isinaddresslist)
       */
      override fun isInAddressList(): Any? = unwrap(this).getIsInAddressList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressBooleanToEvaluateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanToEvaluateProperty):
          IngressBooleanToEvaluateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressBooleanToEvaluateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressBooleanToEvaluateProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanToEvaluateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressBooleanToEvaluateProperty
    }
  }

  /**
   * The structure for an IP based condition matching on the incoming mail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressIpToEvaluateProperty ingressIpToEvaluateProperty = IngressIpToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressiptoevaluate.html)
   */
  public interface IngressIpToEvaluateProperty {
    /**
     * An enum type representing the allowed attribute types for an IP condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressiptoevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingressiptoevaluate-attribute)
     */
    public fun attribute(): String

    /**
     * A builder for [IngressIpToEvaluateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attribute An enum type representing the allowed attribute types for an IP condition.
       * 
       */
      public fun attribute(attribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpToEvaluateProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpToEvaluateProperty.builder()

      /**
       * @param attribute An enum type representing the allowed attribute types for an IP condition.
       * 
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpToEvaluateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpToEvaluateProperty,
    ) : CdkObject(cdkObject),
        IngressIpToEvaluateProperty {
      /**
       * An enum type representing the allowed attribute types for an IP condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressiptoevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingressiptoevaluate-attribute)
       */
      override fun attribute(): String = unwrap(this).getAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressIpToEvaluateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpToEvaluateProperty):
          IngressIpToEvaluateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressIpToEvaluateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressIpToEvaluateProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpToEvaluateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpToEvaluateProperty
    }
  }

  /**
   * The union type representing the allowed types for the left hand side of an IP condition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressIpv4ExpressionProperty ingressIpv4ExpressionProperty =
   * IngressIpv4ExpressionProperty.builder()
   * .evaluate(IngressIpToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv4expression.html)
   */
  public interface IngressIpv4ExpressionProperty {
    /**
     * The left hand side argument of an IP condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv4expression.html#cfn-ses-mailmanagertrafficpolicy-ingressipv4expression-evaluate)
     */
    public fun evaluate(): Any

    /**
     * The matching operator for an IP condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv4expression.html#cfn-ses-mailmanagertrafficpolicy-ingressipv4expression-operator)
     */
    public fun `operator`(): String

    /**
     * The right hand side argument of an IP condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv4expression.html#cfn-ses-mailmanagertrafficpolicy-ingressipv4expression-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [IngressIpv4ExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param evaluate The left hand side argument of an IP condition expression. 
       */
      public fun evaluate(evaluate: IResolvable)

      /**
       * @param evaluate The left hand side argument of an IP condition expression. 
       */
      public fun evaluate(evaluate: IngressIpToEvaluateProperty)

      /**
       * @param evaluate The left hand side argument of an IP condition expression. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b865483d8946ee14ec70f1a357cda1c4d568560e61769b1ed6ad556b8b84415")
      public fun evaluate(evaluate: IngressIpToEvaluateProperty.Builder.() -> Unit)

      /**
       * @param operator The matching operator for an IP condition expression. 
       */
      public fun `operator`(`operator`: String)

      /**
       * @param values The right hand side argument of an IP condition expression. 
       */
      public fun values(values: List<String>)

      /**
       * @param values The right hand side argument of an IP condition expression. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv4ExpressionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv4ExpressionProperty.builder()

      /**
       * @param evaluate The left hand side argument of an IP condition expression. 
       */
      override fun evaluate(evaluate: IResolvable) {
        cdkBuilder.evaluate(evaluate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param evaluate The left hand side argument of an IP condition expression. 
       */
      override fun evaluate(evaluate: IngressIpToEvaluateProperty) {
        cdkBuilder.evaluate(evaluate.let(IngressIpToEvaluateProperty.Companion::unwrap))
      }

      /**
       * @param evaluate The left hand side argument of an IP condition expression. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8b865483d8946ee14ec70f1a357cda1c4d568560e61769b1ed6ad556b8b84415")
      override fun evaluate(evaluate: IngressIpToEvaluateProperty.Builder.() -> Unit): Unit =
          evaluate(IngressIpToEvaluateProperty(evaluate))

      /**
       * @param operator The matching operator for an IP condition expression. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param values The right hand side argument of an IP condition expression. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The right hand side argument of an IP condition expression. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv4ExpressionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv4ExpressionProperty,
    ) : CdkObject(cdkObject),
        IngressIpv4ExpressionProperty {
      /**
       * The left hand side argument of an IP condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv4expression.html#cfn-ses-mailmanagertrafficpolicy-ingressipv4expression-evaluate)
       */
      override fun evaluate(): Any = unwrap(this).getEvaluate()

      /**
       * The matching operator for an IP condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv4expression.html#cfn-ses-mailmanagertrafficpolicy-ingressipv4expression-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()

      /**
       * The right hand side argument of an IP condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv4expression.html#cfn-ses-mailmanagertrafficpolicy-ingressipv4expression-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressIpv4ExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv4ExpressionProperty):
          IngressIpv4ExpressionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressIpv4ExpressionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressIpv4ExpressionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv4ExpressionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv4ExpressionProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressIpv6ExpressionProperty ingressIpv6ExpressionProperty =
   * IngressIpv6ExpressionProperty.builder()
   * .evaluate(IngressIpv6ToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv6expression.html)
   */
  public interface IngressIpv6ExpressionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv6expression.html#cfn-ses-mailmanagertrafficpolicy-ingressipv6expression-evaluate)
     */
    public fun evaluate(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv6expression.html#cfn-ses-mailmanagertrafficpolicy-ingressipv6expression-operator)
     */
    public fun `operator`(): String

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv6expression.html#cfn-ses-mailmanagertrafficpolicy-ingressipv6expression-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [IngressIpv6ExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param evaluate the value to be set. 
       */
      public fun evaluate(evaluate: IResolvable)

      /**
       * @param evaluate the value to be set. 
       */
      public fun evaluate(evaluate: IngressIpv6ToEvaluateProperty)

      /**
       * @param evaluate the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("462f6ea37b7edbcf483658ac04e5e1e9352fd3e2a207df57da78d0db0ccc0bb8")
      public fun evaluate(evaluate: IngressIpv6ToEvaluateProperty.Builder.() -> Unit)

      /**
       * @param operator the value to be set. 
       */
      public fun `operator`(`operator`: String)

      /**
       * @param values the value to be set. 
       */
      public fun values(values: List<String>)

      /**
       * @param values the value to be set. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ExpressionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ExpressionProperty.builder()

      /**
       * @param evaluate the value to be set. 
       */
      override fun evaluate(evaluate: IResolvable) {
        cdkBuilder.evaluate(evaluate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param evaluate the value to be set. 
       */
      override fun evaluate(evaluate: IngressIpv6ToEvaluateProperty) {
        cdkBuilder.evaluate(evaluate.let(IngressIpv6ToEvaluateProperty.Companion::unwrap))
      }

      /**
       * @param evaluate the value to be set. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("462f6ea37b7edbcf483658ac04e5e1e9352fd3e2a207df57da78d0db0ccc0bb8")
      override fun evaluate(evaluate: IngressIpv6ToEvaluateProperty.Builder.() -> Unit): Unit =
          evaluate(IngressIpv6ToEvaluateProperty(evaluate))

      /**
       * @param operator the value to be set. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param values the value to be set. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values the value to be set. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ExpressionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ExpressionProperty,
    ) : CdkObject(cdkObject),
        IngressIpv6ExpressionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv6expression.html#cfn-ses-mailmanagertrafficpolicy-ingressipv6expression-evaluate)
       */
      override fun evaluate(): Any = unwrap(this).getEvaluate()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv6expression.html#cfn-ses-mailmanagertrafficpolicy-ingressipv6expression-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv6expression.html#cfn-ses-mailmanagertrafficpolicy-ingressipv6expression-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressIpv6ExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ExpressionProperty):
          IngressIpv6ExpressionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressIpv6ExpressionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressIpv6ExpressionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ExpressionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ExpressionProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressIpv6ToEvaluateProperty ingressIpv6ToEvaluateProperty =
   * IngressIpv6ToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv6toevaluate.html)
   */
  public interface IngressIpv6ToEvaluateProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv6toevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingressipv6toevaluate-attribute)
     */
    public fun attribute(): String

    /**
     * A builder for [IngressIpv6ToEvaluateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attribute the value to be set. 
       */
      public fun attribute(attribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ToEvaluateProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ToEvaluateProperty.builder()

      /**
       * @param attribute the value to be set. 
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ToEvaluateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ToEvaluateProperty,
    ) : CdkObject(cdkObject),
        IngressIpv6ToEvaluateProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressipv6toevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingressipv6toevaluate-attribute)
       */
      override fun attribute(): String = unwrap(this).getAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressIpv6ToEvaluateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ToEvaluateProperty):
          IngressIpv6ToEvaluateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressIpv6ToEvaluateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressIpv6ToEvaluateProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ToEvaluateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIpv6ToEvaluateProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressIsInAddressListProperty ingressIsInAddressListProperty =
   * IngressIsInAddressListProperty.builder()
   * .addressLists(List.of("addressLists"))
   * .attribute("attribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressisinaddresslist.html)
   */
  public interface IngressIsInAddressListProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressisinaddresslist.html#cfn-ses-mailmanagertrafficpolicy-ingressisinaddresslist-addresslists)
     */
    public fun addressLists(): List<String>

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressisinaddresslist.html#cfn-ses-mailmanagertrafficpolicy-ingressisinaddresslist-attribute)
     */
    public fun attribute(): String

    /**
     * A builder for [IngressIsInAddressListProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param addressLists the value to be set. 
       */
      public fun addressLists(addressLists: List<String>)

      /**
       * @param addressLists the value to be set. 
       */
      public fun addressLists(vararg addressLists: String)

      /**
       * @param attribute the value to be set. 
       */
      public fun attribute(attribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIsInAddressListProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIsInAddressListProperty.builder()

      /**
       * @param addressLists the value to be set. 
       */
      override fun addressLists(addressLists: List<String>) {
        cdkBuilder.addressLists(addressLists)
      }

      /**
       * @param addressLists the value to be set. 
       */
      override fun addressLists(vararg addressLists: String): Unit =
          addressLists(addressLists.toList())

      /**
       * @param attribute the value to be set. 
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIsInAddressListProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIsInAddressListProperty,
    ) : CdkObject(cdkObject),
        IngressIsInAddressListProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressisinaddresslist.html#cfn-ses-mailmanagertrafficpolicy-ingressisinaddresslist-addresslists)
       */
      override fun addressLists(): List<String> = unwrap(this).getAddressLists()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressisinaddresslist.html#cfn-ses-mailmanagertrafficpolicy-ingressisinaddresslist-attribute)
       */
      override fun attribute(): String = unwrap(this).getAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressIsInAddressListProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIsInAddressListProperty):
          IngressIsInAddressListProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressIsInAddressListProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressIsInAddressListProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIsInAddressListProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressIsInAddressListProperty
    }
  }

  /**
   * The structure for a string based condition matching on the incoming mail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressStringExpressionProperty ingressStringExpressionProperty =
   * IngressStringExpressionProperty.builder()
   * .evaluate(IngressStringToEvaluateProperty.builder()
   * .analysis(IngressAnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressstringexpression.html)
   */
  public interface IngressStringExpressionProperty {
    /**
     * The left hand side argument of a string condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressstringexpression.html#cfn-ses-mailmanagertrafficpolicy-ingressstringexpression-evaluate)
     */
    public fun evaluate(): Any

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressstringexpression.html#cfn-ses-mailmanagertrafficpolicy-ingressstringexpression-operator)
     */
    public fun `operator`(): String

    /**
     * The right hand side argument of a string condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressstringexpression.html#cfn-ses-mailmanagertrafficpolicy-ingressstringexpression-values)
     */
    public fun values(): List<String>

    /**
     * A builder for [IngressStringExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param evaluate The left hand side argument of a string condition expression. 
       */
      public fun evaluate(evaluate: IResolvable)

      /**
       * @param evaluate The left hand side argument of a string condition expression. 
       */
      public fun evaluate(evaluate: IngressStringToEvaluateProperty)

      /**
       * @param evaluate The left hand side argument of a string condition expression. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c706df1febba4b1ce7721cf6e344daeed0e8a8316d4f4993d8e9549de96caed3")
      public fun evaluate(evaluate: IngressStringToEvaluateProperty.Builder.() -> Unit)

      /**
       * @param operator the value to be set. 
       */
      public fun `operator`(`operator`: String)

      /**
       * @param values The right hand side argument of a string condition expression. 
       */
      public fun values(values: List<String>)

      /**
       * @param values The right hand side argument of a string condition expression. 
       */
      public fun values(vararg values: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringExpressionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringExpressionProperty.builder()

      /**
       * @param evaluate The left hand side argument of a string condition expression. 
       */
      override fun evaluate(evaluate: IResolvable) {
        cdkBuilder.evaluate(evaluate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param evaluate The left hand side argument of a string condition expression. 
       */
      override fun evaluate(evaluate: IngressStringToEvaluateProperty) {
        cdkBuilder.evaluate(evaluate.let(IngressStringToEvaluateProperty.Companion::unwrap))
      }

      /**
       * @param evaluate The left hand side argument of a string condition expression. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c706df1febba4b1ce7721cf6e344daeed0e8a8316d4f4993d8e9549de96caed3")
      override fun evaluate(evaluate: IngressStringToEvaluateProperty.Builder.() -> Unit): Unit =
          evaluate(IngressStringToEvaluateProperty(evaluate))

      /**
       * @param operator the value to be set. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param values The right hand side argument of a string condition expression. 
       */
      override fun values(values: List<String>) {
        cdkBuilder.values(values)
      }

      /**
       * @param values The right hand side argument of a string condition expression. 
       */
      override fun values(vararg values: String): Unit = values(values.toList())

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringExpressionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringExpressionProperty,
    ) : CdkObject(cdkObject),
        IngressStringExpressionProperty {
      /**
       * The left hand side argument of a string condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressstringexpression.html#cfn-ses-mailmanagertrafficpolicy-ingressstringexpression-evaluate)
       */
      override fun evaluate(): Any = unwrap(this).getEvaluate()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressstringexpression.html#cfn-ses-mailmanagertrafficpolicy-ingressstringexpression-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()

      /**
       * The right hand side argument of a string condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressstringexpression.html#cfn-ses-mailmanagertrafficpolicy-ingressstringexpression-values)
       */
      override fun values(): List<String> = unwrap(this).getValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressStringExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringExpressionProperty):
          IngressStringExpressionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressStringExpressionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressStringExpressionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringExpressionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringExpressionProperty
    }
  }

  /**
   * The union type representing the allowed types for the left hand side of a string condition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressStringToEvaluateProperty ingressStringToEvaluateProperty =
   * IngressStringToEvaluateProperty.builder()
   * .analysis(IngressAnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .attribute("attribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressstringtoevaluate.html)
   */
  public interface IngressStringToEvaluateProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressstringtoevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingressstringtoevaluate-analysis)
     */
    public fun analysis(): Any? = unwrap(this).getAnalysis()

    /**
     * The enum type representing the allowed attribute types for a string condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressstringtoevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingressstringtoevaluate-attribute)
     */
    public fun attribute(): String? = unwrap(this).getAttribute()

    /**
     * A builder for [IngressStringToEvaluateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param analysis the value to be set.
       */
      public fun analysis(analysis: IResolvable)

      /**
       * @param analysis the value to be set.
       */
      public fun analysis(analysis: IngressAnalysisProperty)

      /**
       * @param analysis the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8d6059d7f48c4ffd0c16dc85f1dfb9ec5f4697ae5f829f61e8d250f1db7a1ef")
      public fun analysis(analysis: IngressAnalysisProperty.Builder.() -> Unit)

      /**
       * @param attribute The enum type representing the allowed attribute types for a string
       * condition.
       */
      public fun attribute(attribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringToEvaluateProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringToEvaluateProperty.builder()

      /**
       * @param analysis the value to be set.
       */
      override fun analysis(analysis: IResolvable) {
        cdkBuilder.analysis(analysis.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param analysis the value to be set.
       */
      override fun analysis(analysis: IngressAnalysisProperty) {
        cdkBuilder.analysis(analysis.let(IngressAnalysisProperty.Companion::unwrap))
      }

      /**
       * @param analysis the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8d6059d7f48c4ffd0c16dc85f1dfb9ec5f4697ae5f829f61e8d250f1db7a1ef")
      override fun analysis(analysis: IngressAnalysisProperty.Builder.() -> Unit): Unit =
          analysis(IngressAnalysisProperty(analysis))

      /**
       * @param attribute The enum type representing the allowed attribute types for a string
       * condition.
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringToEvaluateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringToEvaluateProperty,
    ) : CdkObject(cdkObject),
        IngressStringToEvaluateProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressstringtoevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingressstringtoevaluate-analysis)
       */
      override fun analysis(): Any? = unwrap(this).getAnalysis()

      /**
       * The enum type representing the allowed attribute types for a string condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingressstringtoevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingressstringtoevaluate-attribute)
       */
      override fun attribute(): String? = unwrap(this).getAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): IngressStringToEvaluateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringToEvaluateProperty):
          IngressStringToEvaluateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressStringToEvaluateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressStringToEvaluateProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringToEvaluateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressStringToEvaluateProperty
    }
  }

  /**
   * The structure for a TLS related condition matching on the incoming mail.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressTlsProtocolExpressionProperty ingressTlsProtocolExpressionProperty =
   * IngressTlsProtocolExpressionProperty.builder()
   * .evaluate(IngressTlsProtocolToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression.html)
   */
  public interface IngressTlsProtocolExpressionProperty {
    /**
     * The left hand side argument of a TLS condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression.html#cfn-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression-evaluate)
     */
    public fun evaluate(): Any

    /**
     * The matching operator for a TLS condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression.html#cfn-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression-operator)
     */
    public fun `operator`(): String

    /**
     * The right hand side argument of a TLS condition expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression.html#cfn-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression-value)
     */
    public fun `value`(): String

    /**
     * A builder for [IngressTlsProtocolExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param evaluate The left hand side argument of a TLS condition expression. 
       */
      public fun evaluate(evaluate: IResolvable)

      /**
       * @param evaluate The left hand side argument of a TLS condition expression. 
       */
      public fun evaluate(evaluate: IngressTlsProtocolToEvaluateProperty)

      /**
       * @param evaluate The left hand side argument of a TLS condition expression. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f687ed25dc537e1f92335adca939596125ca13f8c6afc835d5bc187e560345b")
      public fun evaluate(evaluate: IngressTlsProtocolToEvaluateProperty.Builder.() -> Unit)

      /**
       * @param operator The matching operator for a TLS condition expression. 
       */
      public fun `operator`(`operator`: String)

      /**
       * @param value The right hand side argument of a TLS condition expression. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolExpressionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolExpressionProperty.builder()

      /**
       * @param evaluate The left hand side argument of a TLS condition expression. 
       */
      override fun evaluate(evaluate: IResolvable) {
        cdkBuilder.evaluate(evaluate.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param evaluate The left hand side argument of a TLS condition expression. 
       */
      override fun evaluate(evaluate: IngressTlsProtocolToEvaluateProperty) {
        cdkBuilder.evaluate(evaluate.let(IngressTlsProtocolToEvaluateProperty.Companion::unwrap))
      }

      /**
       * @param evaluate The left hand side argument of a TLS condition expression. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f687ed25dc537e1f92335adca939596125ca13f8c6afc835d5bc187e560345b")
      override fun evaluate(evaluate: IngressTlsProtocolToEvaluateProperty.Builder.() -> Unit): Unit
          = evaluate(IngressTlsProtocolToEvaluateProperty(evaluate))

      /**
       * @param operator The matching operator for a TLS condition expression. 
       */
      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      /**
       * @param value The right hand side argument of a TLS condition expression. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolExpressionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolExpressionProperty,
    ) : CdkObject(cdkObject),
        IngressTlsProtocolExpressionProperty {
      /**
       * The left hand side argument of a TLS condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression.html#cfn-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression-evaluate)
       */
      override fun evaluate(): Any = unwrap(this).getEvaluate()

      /**
       * The matching operator for a TLS condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression.html#cfn-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression-operator)
       */
      override fun `operator`(): String = unwrap(this).getOperator()

      /**
       * The right hand side argument of a TLS condition expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression.html#cfn-ses-mailmanagertrafficpolicy-ingresstlsprotocolexpression-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IngressTlsProtocolExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolExpressionProperty):
          IngressTlsProtocolExpressionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressTlsProtocolExpressionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressTlsProtocolExpressionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolExpressionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolExpressionProperty
    }
  }

  /**
   * The union type representing the allowed types for the left hand side of a TLS condition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * IngressTlsProtocolToEvaluateProperty ingressTlsProtocolToEvaluateProperty =
   * IngressTlsProtocolToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingresstlsprotocoltoevaluate.html)
   */
  public interface IngressTlsProtocolToEvaluateProperty {
    /**
     * The enum type representing the allowed attribute types for the TLS condition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingresstlsprotocoltoevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingresstlsprotocoltoevaluate-attribute)
     */
    public fun attribute(): String

    /**
     * A builder for [IngressTlsProtocolToEvaluateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attribute The enum type representing the allowed attribute types for the TLS
       * condition. 
       */
      public fun attribute(attribute: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolToEvaluateProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolToEvaluateProperty.builder()

      /**
       * @param attribute The enum type representing the allowed attribute types for the TLS
       * condition. 
       */
      override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolToEvaluateProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolToEvaluateProperty,
    ) : CdkObject(cdkObject),
        IngressTlsProtocolToEvaluateProperty {
      /**
       * The enum type representing the allowed attribute types for the TLS condition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-ingresstlsprotocoltoevaluate.html#cfn-ses-mailmanagertrafficpolicy-ingresstlsprotocoltoevaluate-attribute)
       */
      override fun attribute(): String = unwrap(this).getAttribute()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          IngressTlsProtocolToEvaluateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolToEvaluateProperty):
          IngressTlsProtocolToEvaluateProperty = CdkObjectWrappers.wrap(cdkObject) as?
          IngressTlsProtocolToEvaluateProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: IngressTlsProtocolToEvaluateProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolToEvaluateProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.IngressTlsProtocolToEvaluateProperty
    }
  }

  /**
   * The email traffic filtering conditions which are contained in a traffic policy resource.
   *
   *
   * This data type is a UNION, so only one of the following members can be specified when used or
   * returned.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * PolicyConditionProperty policyConditionProperty = PolicyConditionProperty.builder()
   * .booleanExpression(IngressBooleanExpressionProperty.builder()
   * .evaluate(IngressBooleanToEvaluateProperty.builder()
   * .analysis(IngressAnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .isInAddressList(IngressIsInAddressListProperty.builder()
   * .addressLists(List.of("addressLists"))
   * .attribute("attribute")
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
   * .ipv6Expression(IngressIpv6ExpressionProperty.builder()
   * .evaluate(IngressIpv6ToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .stringExpression(IngressStringExpressionProperty.builder()
   * .evaluate(IngressStringToEvaluateProperty.builder()
   * .analysis(IngressAnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policycondition.html)
   */
  public interface PolicyConditionProperty {
    /**
     * This represents a boolean type condition matching on the incoming mail.
     *
     * It performs the boolean operation configured in 'Operator' and evaluates the 'Protocol'
     * object against the 'Value'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policycondition.html#cfn-ses-mailmanagertrafficpolicy-policycondition-booleanexpression)
     */
    public fun booleanExpression(): Any? = unwrap(this).getBooleanExpression()

    /**
     * This represents an IP based condition matching on the incoming mail.
     *
     * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
     * against the 'Value'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policycondition.html#cfn-ses-mailmanagertrafficpolicy-policycondition-ipexpression)
     */
    public fun ipExpression(): Any? = unwrap(this).getIpExpression()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policycondition.html#cfn-ses-mailmanagertrafficpolicy-policycondition-ipv6expression)
     */
    public fun ipv6Expression(): Any? = unwrap(this).getIpv6Expression()

    /**
     * This represents a string based condition matching on the incoming mail.
     *
     * It performs the string operation configured in 'Operator' and evaluates the 'Protocol' object
     * against the 'Value'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policycondition.html#cfn-ses-mailmanagertrafficpolicy-policycondition-stringexpression)
     */
    public fun stringExpression(): Any? = unwrap(this).getStringExpression()

    /**
     * This represents a TLS based condition matching on the incoming mail.
     *
     * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
     * against the 'Value'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policycondition.html#cfn-ses-mailmanagertrafficpolicy-policycondition-tlsexpression)
     */
    public fun tlsExpression(): Any? = unwrap(this).getTlsExpression()

    /**
     * A builder for [PolicyConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param booleanExpression This represents a boolean type condition matching on the incoming
       * mail.
       * It performs the boolean operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       */
      public fun booleanExpression(booleanExpression: IResolvable)

      /**
       * @param booleanExpression This represents a boolean type condition matching on the incoming
       * mail.
       * It performs the boolean operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       */
      public fun booleanExpression(booleanExpression: IngressBooleanExpressionProperty)

      /**
       * @param booleanExpression This represents a boolean type condition matching on the incoming
       * mail.
       * It performs the boolean operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e031e96245ce4b8ccaf7bc15e90efcb703a7cbc9d508d5a9a0ebe1504048825")
      public
          fun booleanExpression(booleanExpression: IngressBooleanExpressionProperty.Builder.() -> Unit)

      /**
       * @param ipExpression This represents an IP based condition matching on the incoming mail.
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       */
      public fun ipExpression(ipExpression: IResolvable)

      /**
       * @param ipExpression This represents an IP based condition matching on the incoming mail.
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       */
      public fun ipExpression(ipExpression: IngressIpv4ExpressionProperty)

      /**
       * @param ipExpression This represents an IP based condition matching on the incoming mail.
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c5fcb3c2a7821f3bbef3fbc7a85b73bcf5e67f62e0d3a04f11d35bc79db7aaa")
      public fun ipExpression(ipExpression: IngressIpv4ExpressionProperty.Builder.() -> Unit)

      /**
       * @param ipv6Expression the value to be set.
       */
      public fun ipv6Expression(ipv6Expression: IResolvable)

      /**
       * @param ipv6Expression the value to be set.
       */
      public fun ipv6Expression(ipv6Expression: IngressIpv6ExpressionProperty)

      /**
       * @param ipv6Expression the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f00b72765b82ad9f6346da5a5d4cfa55a783a9d4b929d2cd96522f19392efb72")
      public fun ipv6Expression(ipv6Expression: IngressIpv6ExpressionProperty.Builder.() -> Unit)

      /**
       * @param stringExpression This represents a string based condition matching on the incoming
       * mail.
       * It performs the string operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       */
      public fun stringExpression(stringExpression: IResolvable)

      /**
       * @param stringExpression This represents a string based condition matching on the incoming
       * mail.
       * It performs the string operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       */
      public fun stringExpression(stringExpression: IngressStringExpressionProperty)

      /**
       * @param stringExpression This represents a string based condition matching on the incoming
       * mail.
       * It performs the string operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eed509b90a5ff84be6b2fce1457f92b18aeb4724fef6b9a8193874897111a97a")
      public
          fun stringExpression(stringExpression: IngressStringExpressionProperty.Builder.() -> Unit)

      /**
       * @param tlsExpression This represents a TLS based condition matching on the incoming mail.
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       */
      public fun tlsExpression(tlsExpression: IResolvable)

      /**
       * @param tlsExpression This represents a TLS based condition matching on the incoming mail.
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       */
      public fun tlsExpression(tlsExpression: IngressTlsProtocolExpressionProperty)

      /**
       * @param tlsExpression This represents a TLS based condition matching on the incoming mail.
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1eab6780e7dbd11e445bf4d9ab9a871a2d9cec1b971ce08ca165ccfc947c7f3e")
      public
          fun tlsExpression(tlsExpression: IngressTlsProtocolExpressionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyConditionProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyConditionProperty.builder()

      /**
       * @param booleanExpression This represents a boolean type condition matching on the incoming
       * mail.
       * It performs the boolean operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       */
      override fun booleanExpression(booleanExpression: IResolvable) {
        cdkBuilder.booleanExpression(booleanExpression.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param booleanExpression This represents a boolean type condition matching on the incoming
       * mail.
       * It performs the boolean operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       */
      override fun booleanExpression(booleanExpression: IngressBooleanExpressionProperty) {
        cdkBuilder.booleanExpression(booleanExpression.let(IngressBooleanExpressionProperty.Companion::unwrap))
      }

      /**
       * @param booleanExpression This represents a boolean type condition matching on the incoming
       * mail.
       * It performs the boolean operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e031e96245ce4b8ccaf7bc15e90efcb703a7cbc9d508d5a9a0ebe1504048825")
      override
          fun booleanExpression(booleanExpression: IngressBooleanExpressionProperty.Builder.() -> Unit):
          Unit = booleanExpression(IngressBooleanExpressionProperty(booleanExpression))

      /**
       * @param ipExpression This represents an IP based condition matching on the incoming mail.
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       */
      override fun ipExpression(ipExpression: IResolvable) {
        cdkBuilder.ipExpression(ipExpression.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ipExpression This represents an IP based condition matching on the incoming mail.
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       */
      override fun ipExpression(ipExpression: IngressIpv4ExpressionProperty) {
        cdkBuilder.ipExpression(ipExpression.let(IngressIpv4ExpressionProperty.Companion::unwrap))
      }

      /**
       * @param ipExpression This represents an IP based condition matching on the incoming mail.
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c5fcb3c2a7821f3bbef3fbc7a85b73bcf5e67f62e0d3a04f11d35bc79db7aaa")
      override fun ipExpression(ipExpression: IngressIpv4ExpressionProperty.Builder.() -> Unit):
          Unit = ipExpression(IngressIpv4ExpressionProperty(ipExpression))

      /**
       * @param ipv6Expression the value to be set.
       */
      override fun ipv6Expression(ipv6Expression: IResolvable) {
        cdkBuilder.ipv6Expression(ipv6Expression.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ipv6Expression the value to be set.
       */
      override fun ipv6Expression(ipv6Expression: IngressIpv6ExpressionProperty) {
        cdkBuilder.ipv6Expression(ipv6Expression.let(IngressIpv6ExpressionProperty.Companion::unwrap))
      }

      /**
       * @param ipv6Expression the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f00b72765b82ad9f6346da5a5d4cfa55a783a9d4b929d2cd96522f19392efb72")
      override fun ipv6Expression(ipv6Expression: IngressIpv6ExpressionProperty.Builder.() -> Unit):
          Unit = ipv6Expression(IngressIpv6ExpressionProperty(ipv6Expression))

      /**
       * @param stringExpression This represents a string based condition matching on the incoming
       * mail.
       * It performs the string operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       */
      override fun stringExpression(stringExpression: IResolvable) {
        cdkBuilder.stringExpression(stringExpression.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param stringExpression This represents a string based condition matching on the incoming
       * mail.
       * It performs the string operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       */
      override fun stringExpression(stringExpression: IngressStringExpressionProperty) {
        cdkBuilder.stringExpression(stringExpression.let(IngressStringExpressionProperty.Companion::unwrap))
      }

      /**
       * @param stringExpression This represents a string based condition matching on the incoming
       * mail.
       * It performs the string operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("eed509b90a5ff84be6b2fce1457f92b18aeb4724fef6b9a8193874897111a97a")
      override
          fun stringExpression(stringExpression: IngressStringExpressionProperty.Builder.() -> Unit):
          Unit = stringExpression(IngressStringExpressionProperty(stringExpression))

      /**
       * @param tlsExpression This represents a TLS based condition matching on the incoming mail.
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       */
      override fun tlsExpression(tlsExpression: IResolvable) {
        cdkBuilder.tlsExpression(tlsExpression.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tlsExpression This represents a TLS based condition matching on the incoming mail.
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       */
      override fun tlsExpression(tlsExpression: IngressTlsProtocolExpressionProperty) {
        cdkBuilder.tlsExpression(tlsExpression.let(IngressTlsProtocolExpressionProperty.Companion::unwrap))
      }

      /**
       * @param tlsExpression This represents a TLS based condition matching on the incoming mail.
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1eab6780e7dbd11e445bf4d9ab9a871a2d9cec1b971ce08ca165ccfc947c7f3e")
      override
          fun tlsExpression(tlsExpression: IngressTlsProtocolExpressionProperty.Builder.() -> Unit):
          Unit = tlsExpression(IngressTlsProtocolExpressionProperty(tlsExpression))

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyConditionProperty,
    ) : CdkObject(cdkObject),
        PolicyConditionProperty {
      /**
       * This represents a boolean type condition matching on the incoming mail.
       *
       * It performs the boolean operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policycondition.html#cfn-ses-mailmanagertrafficpolicy-policycondition-booleanexpression)
       */
      override fun booleanExpression(): Any? = unwrap(this).getBooleanExpression()

      /**
       * This represents an IP based condition matching on the incoming mail.
       *
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policycondition.html#cfn-ses-mailmanagertrafficpolicy-policycondition-ipexpression)
       */
      override fun ipExpression(): Any? = unwrap(this).getIpExpression()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policycondition.html#cfn-ses-mailmanagertrafficpolicy-policycondition-ipv6expression)
       */
      override fun ipv6Expression(): Any? = unwrap(this).getIpv6Expression()

      /**
       * This represents a string based condition matching on the incoming mail.
       *
       * It performs the string operation configured in 'Operator' and evaluates the 'Protocol'
       * object against the 'Value'.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policycondition.html#cfn-ses-mailmanagertrafficpolicy-policycondition-stringexpression)
       */
      override fun stringExpression(): Any? = unwrap(this).getStringExpression()

      /**
       * This represents a TLS based condition matching on the incoming mail.
       *
       * It performs the operation configured in 'Operator' and evaluates the 'Protocol' object
       * against the 'Value'.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policycondition.html#cfn-ses-mailmanagertrafficpolicy-policycondition-tlsexpression)
       */
      override fun tlsExpression(): Any? = unwrap(this).getTlsExpression()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyConditionProperty):
          PolicyConditionProperty = CdkObjectWrappers.wrap(cdkObject) as? PolicyConditionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyConditionProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyConditionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyConditionProperty
    }
  }

  /**
   * The structure containing traffic policy conditions and actions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ses.*;
   * PolicyStatementProperty policyStatementProperty = PolicyStatementProperty.builder()
   * .action("action")
   * .conditions(List.of(PolicyConditionProperty.builder()
   * .booleanExpression(IngressBooleanExpressionProperty.builder()
   * .evaluate(IngressBooleanToEvaluateProperty.builder()
   * .analysis(IngressAnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
   * .isInAddressList(IngressIsInAddressListProperty.builder()
   * .addressLists(List.of("addressLists"))
   * .attribute("attribute")
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
   * .ipv6Expression(IngressIpv6ExpressionProperty.builder()
   * .evaluate(IngressIpv6ToEvaluateProperty.builder()
   * .attribute("attribute")
   * .build())
   * .operator("operator")
   * .values(List.of("values"))
   * .build())
   * .stringExpression(IngressStringExpressionProperty.builder()
   * .evaluate(IngressStringToEvaluateProperty.builder()
   * .analysis(IngressAnalysisProperty.builder()
   * .analyzer("analyzer")
   * .resultField("resultField")
   * .build())
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policystatement.html)
   */
  public interface PolicyStatementProperty {
    /**
     * The action that informs a traffic policy resource to either allow or block the email if it
     * matches a condition in the policy statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policystatement.html#cfn-ses-mailmanagertrafficpolicy-policystatement-action)
     */
    public fun action(): String

    /**
     * The list of conditions to apply to incoming messages for filtering email traffic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policystatement.html#cfn-ses-mailmanagertrafficpolicy-policystatement-conditions)
     */
    public fun conditions(): Any

    /**
     * A builder for [PolicyStatementProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param action The action that informs a traffic policy resource to either allow or block
       * the email if it matches a condition in the policy statement. 
       */
      public fun action(action: String)

      /**
       * @param conditions The list of conditions to apply to incoming messages for filtering email
       * traffic. 
       */
      public fun conditions(conditions: IResolvable)

      /**
       * @param conditions The list of conditions to apply to incoming messages for filtering email
       * traffic. 
       */
      public fun conditions(conditions: List<Any>)

      /**
       * @param conditions The list of conditions to apply to incoming messages for filtering email
       * traffic. 
       */
      public fun conditions(vararg conditions: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyStatementProperty.Builder
          =
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyStatementProperty.builder()

      /**
       * @param action The action that informs a traffic policy resource to either allow or block
       * the email if it matches a condition in the policy statement. 
       */
      override fun action(action: String) {
        cdkBuilder.action(action)
      }

      /**
       * @param conditions The list of conditions to apply to incoming messages for filtering email
       * traffic. 
       */
      override fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param conditions The list of conditions to apply to incoming messages for filtering email
       * traffic. 
       */
      override fun conditions(conditions: List<Any>) {
        cdkBuilder.conditions(conditions.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param conditions The list of conditions to apply to incoming messages for filtering email
       * traffic. 
       */
      override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

      public fun build():
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyStatementProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyStatementProperty,
    ) : CdkObject(cdkObject),
        PolicyStatementProperty {
      /**
       * The action that informs a traffic policy resource to either allow or block the email if it
       * matches a condition in the policy statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policystatement.html#cfn-ses-mailmanagertrafficpolicy-policystatement-action)
       */
      override fun action(): String = unwrap(this).getAction()

      /**
       * The list of conditions to apply to incoming messages for filtering email traffic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-mailmanagertrafficpolicy-policystatement.html#cfn-ses-mailmanagertrafficpolicy-policystatement-conditions)
       */
      override fun conditions(): Any = unwrap(this).getConditions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyStatementProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyStatementProperty):
          PolicyStatementProperty = CdkObjectWrappers.wrap(cdkObject) as? PolicyStatementProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyStatementProperty):
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyStatementProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ses.CfnMailManagerTrafficPolicy.PolicyStatementProperty
    }
  }
}
