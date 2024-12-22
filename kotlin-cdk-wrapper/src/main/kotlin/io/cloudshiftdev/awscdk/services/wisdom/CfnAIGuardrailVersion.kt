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
 * Definition of AWS::Wisdom::AIGuardrailVersion Resource Type.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.wisdom.*;
 * CfnAIGuardrailVersion cfnAIGuardrailVersion = CfnAIGuardrailVersion.Builder.create(this,
 * "MyCfnAIGuardrailVersion")
 * .aiGuardrailId("aiGuardrailId")
 * .assistantId("assistantId")
 * // the properties below are optional
 * .modifiedTimeSeconds(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html)
 */
public open class CfnAIGuardrailVersion(
  cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersion,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAIGuardrailVersionProps,
  ) :
      this(software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersion(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAIGuardrailVersionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAIGuardrailVersionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAIGuardrailVersionProps(props)
  )

  /**
   *
   */
  public open fun aiGuardrailId(): String = unwrap(this).getAiGuardrailId()

  /**
   *
   */
  public open fun aiGuardrailId(`value`: String) {
    unwrap(this).setAiGuardrailId(`value`)
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
  public open fun attrAiGuardrailArn(): String = unwrap(this).getAttrAiGuardrailArn()

  /**
   *
   */
  public open fun attrAiGuardrailVersionId(): String = unwrap(this).getAttrAiGuardrailVersionId()

  /**
   *
   */
  public open fun attrAssistantArn(): String = unwrap(this).getAttrAssistantArn()

  /**
   *
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
   *
   */
  public open fun modifiedTimeSeconds(): Number? = unwrap(this).getModifiedTimeSeconds()

  /**
   *
   */
  public open fun modifiedTimeSeconds(`value`: Number) {
    unwrap(this).setModifiedTimeSeconds(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.wisdom.CfnAIGuardrailVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-aiguardrailid)
     * @param aiGuardrailId 
     */
    public fun aiGuardrailId(aiGuardrailId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-assistantid)
     * @param assistantId 
     */
    public fun assistantId(assistantId: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-modifiedtimeseconds)
     * @param modifiedTimeSeconds 
     */
    public fun modifiedTimeSeconds(modifiedTimeSeconds: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersion.Builder =
        software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersion.Builder.create(scope, id)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-aiguardrailid)
     * @param aiGuardrailId 
     */
    override fun aiGuardrailId(aiGuardrailId: String) {
      cdkBuilder.aiGuardrailId(aiGuardrailId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-assistantid)
     * @param assistantId 
     */
    override fun assistantId(assistantId: String) {
      cdkBuilder.assistantId(assistantId)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wisdom-aiguardrailversion.html#cfn-wisdom-aiguardrailversion-modifiedtimeseconds)
     * @param modifiedTimeSeconds 
     */
    override fun modifiedTimeSeconds(modifiedTimeSeconds: Number) {
      cdkBuilder.modifiedTimeSeconds(modifiedTimeSeconds)
    }

    public fun build(): software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAIGuardrailVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAIGuardrailVersion(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersion):
        CfnAIGuardrailVersion = CfnAIGuardrailVersion(cdkObject)

    internal fun unwrap(wrapped: CfnAIGuardrailVersion):
        software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.wisdom.CfnAIGuardrailVersion
  }
}
