@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bedrock

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a version of the guardrail.
 *
 * Use this API to create a snapshot of the guardrail when you are satisfied with a configuration,
 * or to compare the configuration with another version.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bedrock.*;
 * CfnGuardrailVersion cfnGuardrailVersion = CfnGuardrailVersion.Builder.create(this,
 * "MyCfnGuardrailVersion")
 * .guardrailIdentifier("guardrailIdentifier")
 * // the properties below are optional
 * .description("description")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrailversion.html)
 */
public open class CfnGuardrailVersion(
  cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrailVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGuardrailVersionProps,
  ) :
      this(software.amazon.awscdk.services.bedrock.CfnGuardrailVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnGuardrailVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnGuardrailVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnGuardrailVersionProps(props)
  )

  /**
   * The ARN of the guardrail.
   */
  public open fun attrGuardrailArn(): String = unwrap(this).getAttrGuardrailArn()

  /**
   * The unique identifier of the guardrail.
   */
  public open fun attrGuardrailId(): String = unwrap(this).getAttrGuardrailId()

  /**
   * The version of the guardrail.
   */
  public open fun attrVersion(): String = unwrap(this).getAttrVersion()

  /**
   * A description of the guardrail version.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the guardrail version.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The unique identifier of the guardrail.
   */
  public open fun guardrailIdentifier(): String = unwrap(this).getGuardrailIdentifier()

  /**
   * The unique identifier of the guardrail.
   */
  public open fun guardrailIdentifier(`value`: String) {
    unwrap(this).setGuardrailIdentifier(`value`)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bedrock.CfnGuardrailVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the guardrail version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrailversion.html#cfn-bedrock-guardrailversion-description)
     * @param description A description of the guardrail version. 
     */
    public fun description(description: String)

    /**
     * The unique identifier of the guardrail.
     *
     * This can be an ID or the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrailversion.html#cfn-bedrock-guardrailversion-guardrailidentifier)
     * @param guardrailIdentifier The unique identifier of the guardrail. 
     */
    public fun guardrailIdentifier(guardrailIdentifier: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bedrock.CfnGuardrailVersion.Builder =
        software.amazon.awscdk.services.bedrock.CfnGuardrailVersion.Builder.create(scope, id)

    /**
     * A description of the guardrail version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrailversion.html#cfn-bedrock-guardrailversion-description)
     * @param description A description of the guardrail version. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The unique identifier of the guardrail.
     *
     * This can be an ID or the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bedrock-guardrailversion.html#cfn-bedrock-guardrailversion-guardrailidentifier)
     * @param guardrailIdentifier The unique identifier of the guardrail. 
     */
    override fun guardrailIdentifier(guardrailIdentifier: String) {
      cdkBuilder.guardrailIdentifier(guardrailIdentifier)
    }

    public fun build(): software.amazon.awscdk.services.bedrock.CfnGuardrailVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bedrock.CfnGuardrailVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnGuardrailVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnGuardrailVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bedrock.CfnGuardrailVersion):
        CfnGuardrailVersion = CfnGuardrailVersion(cdkObject)

    internal fun unwrap(wrapped: CfnGuardrailVersion):
        software.amazon.awscdk.services.bedrock.CfnGuardrailVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.bedrock.CfnGuardrailVersion
  }
}
