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
 * Creates and Amazon Q in Connect AI Agent version.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAIAgentVersion cfnAIAgentVersion = CfnAIAgentVersion.Builder.create(this,
 * "MyCfnAIAgentVersion")
 * .aiAgentId("aiAgentId")
 * .assistantId("assistantId")
 * // the properties below are optional
 * .modifiedTimeSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html)
 */
public open class CfnAIAgentVersion(
  cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgentVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAIAgentVersionProps,
  ) :
      this(software.amazon.awscdk.services.wisdom.CfnAIAgentVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAIAgentVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAIAgentVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAIAgentVersionProps(props)
  )

  /**
   * The identifier of the AI Agent.
   */
  public open fun aiAgentId(): String = unwrap(this).getAiAgentId()

  /**
   * The identifier of the AI Agent.
   */
  public open fun aiAgentId(`value`: String) {
    unwrap(this).setAiAgentId(`value`)
  }

  /**
   *
   */
  public open fun assistantId(): String = unwrap(this).getAssistantId()

  /**
   *
   */
  public open fun assistantId(`value`: String) {
    unwrap(this).setAssistantId(`value`)
  }

  /**
   *
   */
  public open fun attrAiAgentArn(): String = unwrap(this).getAttrAiAgentArn()

  /**
   *
   */
  public open fun attrAiAgentVersionId(): String = unwrap(this).getAttrAiAgentVersionId()

  /**
   *
   */
  public open fun attrAssistantArn(): String = unwrap(this).getAttrAssistantArn()

  /**
   * The version number for this AI Agent version.
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
   * The time the AI Agent version was last modified in seconds.
   */
  public open fun modifiedTimeSeconds(): Number? = unwrap(this).getModifiedTimeSeconds()

  /**
   * The time the AI Agent version was last modified in seconds.
   */
  public open fun modifiedTimeSeconds(`value`: Number) {
    unwrap(this).setModifiedTimeSeconds(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wisdom.CfnAIAgentVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier of the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html#cfn-wisdom-aiagentversion-aiagentid)
     * @param aiAgentId The identifier of the AI Agent. 
     */
    public fun aiAgentId(aiAgentId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html#cfn-wisdom-aiagentversion-assistantid)
     * @param assistantId 
     */
    public fun assistantId(assistantId: String)

    /**
     * The time the AI Agent version was last modified in seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html#cfn-wisdom-aiagentversion-modifiedtimeseconds)
     * @param modifiedTimeSeconds The time the AI Agent version was last modified in seconds. 
     */
    public fun modifiedTimeSeconds(modifiedTimeSeconds: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAIAgentVersion.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIAgentVersion.Builder.create(scope, id)

    /**
     * The identifier of the AI Agent.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html#cfn-wisdom-aiagentversion-aiagentid)
     * @param aiAgentId The identifier of the AI Agent. 
     */
    override fun aiAgentId(aiAgentId: String) {
      cdkBuilder.aiAgentId(aiAgentId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html#cfn-wisdom-aiagentversion-assistantid)
     * @param assistantId 
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * The time the AI Agent version was last modified in seconds.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiagentversion.html#cfn-wisdom-aiagentversion-modifiedtimeseconds)
     * @param modifiedTimeSeconds The time the AI Agent version was last modified in seconds. 
     */
    override fun modifiedTimeSeconds(modifiedTimeSeconds: Number) {
      cdkBuilder.modifiedTimeSeconds(modifiedTimeSeconds)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAIAgentVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wisdom.CfnAIAgentVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAIAgentVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAIAgentVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIAgentVersion):
        CfnAIAgentVersion = CfnAIAgentVersion(cdkObject)

    internal fun unwrap(wrapped: CfnAIAgentVersion):
        software.amazon.awscdk.services.wisdom.CfnAIAgentVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.wisdom.CfnAIAgentVersion
  }
}
