@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.wisdom

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Q in Connect AI Prompt version.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAIPromptVersion cfnAIPromptVersion = CfnAIPromptVersion.Builder.create(this,
 * "MyCfnAIPromptVersion")
 * .aiPromptId("aiPromptId")
 * .assistantId("assistantId")
 * // the properties below are optional
 * .modifiedTimeSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html)
 */
public open class CfnAIPromptVersion(
  cdkObject: software.amazon.awscdk.services.wisdom.CfnAIPromptVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAIPromptVersionProps,
  ) :
      this(software.amazon.awscdk.services.wisdom.CfnAIPromptVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAIPromptVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAIPromptVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAIPromptVersionProps(props)
  )

  /**
   * The identifier of the Amazon Q in Connect AI prompt.
   */
  public open fun aiPromptId(): String = unwrap(this).getAiPromptId()

  /**
   * The identifier of the Amazon Q in Connect AI prompt.
   */
  public open fun aiPromptId(`value`: String) {
    unwrap(this).setAiPromptId(`value`)
  }

  /**
   * The identifier of the Amazon Q in Connect assistant.
   */
  public open fun assistantId(): String = unwrap(this).getAssistantId()

  /**
   * The identifier of the Amazon Q in Connect assistant.
   */
  public open fun assistantId(`value`: String) {
    unwrap(this).setAssistantId(`value`)
  }

  /**
   *
   */
  public open fun attrAiPromptArn(): String = unwrap(this).getAttrAiPromptArn()

  /**
   *
   */
  public open fun attrAiPromptVersionId(): String = unwrap(this).getAttrAiPromptVersionId()

  /**
   *
   */
  public open fun attrAssistantArn(): String = unwrap(this).getAttrAssistantArn()

  /**
   * The version number for this AI Prompt version.
   */
  public open fun attrVersionNumber(): IResolvable =
      unwrap(this).getAttrVersionNumber().let(IResolvable::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The time the AI Prompt version was last modified in seconds.
   */
  public open fun modifiedTimeSeconds(): Number? = unwrap(this).getModifiedTimeSeconds()

  /**
   * The time the AI Prompt version was last modified in seconds.
   */
  public open fun modifiedTimeSeconds(`value`: Number) {
    unwrap(this).setModifiedTimeSeconds(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wisdom.CfnAIPromptVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the Amazon Q in Connect AI prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html#cfn-wisdom-aipromptversion-aipromptid)
     * @param aiPromptId The identifier of the Amazon Q in Connect AI prompt. 
     */
    public fun aiPromptId(aiPromptId: String)

    /**
     * The identifier of the Amazon Q in Connect assistant.
     *
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html#cfn-wisdom-aipromptversion-assistantid)
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     */
    public fun assistantId(assistantId: String)

    /**
     * The time the AI Prompt version was last modified in seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html#cfn-wisdom-aipromptversion-modifiedtimeseconds)
     * @param modifiedTimeSeconds The time the AI Prompt version was last modified in seconds. 
     */
    public fun modifiedTimeSeconds(modifiedTimeSeconds: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAIPromptVersion.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIPromptVersion.Builder.create(scope, id)

    /**
     * The identifier of the Amazon Q in Connect AI prompt.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html#cfn-wisdom-aipromptversion-aipromptid)
     * @param aiPromptId The identifier of the Amazon Q in Connect AI prompt. 
     */
    override fun aiPromptId(aiPromptId: String) {
      cdkBuilder.aiPromptId(aiPromptId)
    }

    /**
     * The identifier of the Amazon Q in Connect assistant.
     *
     * Can be either the ID or the ARN. URLs cannot contain the ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html#cfn-wisdom-aipromptversion-assistantid)
     * @param assistantId The identifier of the Amazon Q in Connect assistant. 
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * The time the AI Prompt version was last modified in seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aipromptversion.html#cfn-wisdom-aipromptversion-modifiedtimeseconds)
     * @param modifiedTimeSeconds The time the AI Prompt version was last modified in seconds. 
     */
    override fun modifiedTimeSeconds(modifiedTimeSeconds: Number) {
      cdkBuilder.modifiedTimeSeconds(modifiedTimeSeconds)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAIPromptVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wisdom.CfnAIPromptVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAIPromptVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAIPromptVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIPromptVersion):
        CfnAIPromptVersion = CfnAIPromptVersion(cdkObject)

    internal fun unwrap(wrapped: CfnAIPromptVersion):
        software.amazon.awscdk.services.wisdom.CfnAIPromptVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.wisdom.CfnAIPromptVersion
  }
}
