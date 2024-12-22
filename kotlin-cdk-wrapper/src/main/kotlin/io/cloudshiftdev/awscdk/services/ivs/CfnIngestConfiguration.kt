@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::IVS::IngestConfiguration` resource specifies an ingest protocol to be used for a stage.
 *
 * For more information, see [Stream
 * Ingest](https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/rt-stream-ingest.html) in the
 * *Amazon IVS Real-Time Streaming User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnIngestConfiguration cfnIngestConfiguration = CfnIngestConfiguration.Builder.create(this,
 * "MyCfnIngestConfiguration")
 * .ingestProtocol("ingestProtocol")
 * .insecureIngest(false)
 * .name("name")
 * .stageArn("stageArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .userId("userId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html)
 */
public open class CfnIngestConfiguration(
  cdkObject: software.amazon.awscdk.services.ivs.CfnIngestConfiguration,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ivs.CfnIngestConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIngestConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.ivs.CfnIngestConfiguration(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnIngestConfigurationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnIngestConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnIngestConfigurationProps(props)
  )

  /**
   * The ingest-configuration ARN.
   *
   * For example: `arn:aws:ivs:us-west-2:123456789012:ingest-configuration/abcdABCDefgh`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * ID of the participant within the stage.
   *
   * For example: `abCDEf12GHIj`
   */
  public open fun attrParticipantId(): String = unwrap(this).getAttrParticipantId()

  /**
   * State of the ingest configuration.
   *
   * It is `ACTIVE` if a publisher currently is publishing to the stage associated with the ingest
   * configuration. Valid values: `ACTIVE` | `INACTIVE` .
   */
  public open fun attrState(): String = unwrap(this).getAttrState()

  /**
   * Ingest-key value for the RTMP(S) protocol.
   *
   * For example: `skSKABCDefgh`
   */
  public open fun attrStreamKey(): String = unwrap(this).getAttrStreamKey()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Type of ingest protocol that the user employs for broadcasting.
   */
  public open fun ingestProtocol(): String? = unwrap(this).getIngestProtocol()

  /**
   * Type of ingest protocol that the user employs for broadcasting.
   */
  public open fun ingestProtocol(`value`: String) {
    unwrap(this).setIngestProtocol(`value`)
  }

  /**
   * Whether the channel allows insecure RTMP ingest.
   */
  public open fun insecureIngest(): Any? = unwrap(this).getInsecureIngest()

  /**
   * Whether the channel allows insecure RTMP ingest.
   */
  public open fun insecureIngest(`value`: Boolean) {
    unwrap(this).setInsecureIngest(`value`)
  }

  /**
   * Whether the channel allows insecure RTMP ingest.
   */
  public open fun insecureIngest(`value`: IResolvable) {
    unwrap(this).setInsecureIngest(`value`.let(IResolvable.Companion::unwrap))
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
   * Ingest name.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Ingest name.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * ARN of the stage with which the IngestConfiguration is associated.
   */
  public open fun stageArn(): String? = unwrap(this).getStageArn()

  /**
   * ARN of the stage with which the IngestConfiguration is associated.
   */
  public open fun stageArn(`value`: String) {
    unwrap(this).setStageArn(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * Customer-assigned name to help identify the participant using the IngestConfiguration;
   */
  public open fun userId(): String? = unwrap(this).getUserId()

  /**
   * Customer-assigned name to help identify the participant using the IngestConfiguration;
   */
  public open fun userId(`value`: String) {
    unwrap(this).setUserId(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ivs.CfnIngestConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Type of ingest protocol that the user employs for broadcasting.
     *
     * Default: - "RTMPS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-ingestprotocol)
     * @param ingestProtocol Type of ingest protocol that the user employs for broadcasting. 
     */
    public fun ingestProtocol(ingestProtocol: String)

    /**
     * Whether the channel allows insecure RTMP ingest.
     *
     * Default: `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-insecureingest)
     * @param insecureIngest Whether the channel allows insecure RTMP ingest. 
     */
    public fun insecureIngest(insecureIngest: Boolean)

    /**
     * Whether the channel allows insecure RTMP ingest.
     *
     * Default: `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-insecureingest)
     * @param insecureIngest Whether the channel allows insecure RTMP ingest. 
     */
    public fun insecureIngest(insecureIngest: IResolvable)

    /**
     * Ingest name.
     *
     * Default: - "-"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-name)
     * @param name Ingest name. 
     */
    public fun name(name: String)

    /**
     * ARN of the stage with which the IngestConfiguration is associated.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-stagearn)
     * @param stageArn ARN of the stage with which the IngestConfiguration is associated. 
     */
    public fun stageArn(stageArn: String)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Customer-assigned name to help identify the participant using the IngestConfiguration;
     *
     * this can be used to link a participant to a user in the customer’s own systems. This can be
     * any UTF-8 encoded text. *This field is exposed to all stage participants and should not be used
     * for personally identifying, confidential, or sensitive information.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-userid)
     * @param userId Customer-assigned name to help identify the participant using the
     * IngestConfiguration;. 
     */
    public fun userId(userId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnIngestConfiguration.Builder =
        software.amazon.awscdk.services.ivs.CfnIngestConfiguration.Builder.create(scope, id)

    /**
     * Type of ingest protocol that the user employs for broadcasting.
     *
     * Default: - "RTMPS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-ingestprotocol)
     * @param ingestProtocol Type of ingest protocol that the user employs for broadcasting. 
     */
    override fun ingestProtocol(ingestProtocol: String) {
      cdkBuilder.ingestProtocol(ingestProtocol)
    }

    /**
     * Whether the channel allows insecure RTMP ingest.
     *
     * Default: `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-insecureingest)
     * @param insecureIngest Whether the channel allows insecure RTMP ingest. 
     */
    override fun insecureIngest(insecureIngest: Boolean) {
      cdkBuilder.insecureIngest(insecureIngest)
    }

    /**
     * Whether the channel allows insecure RTMP ingest.
     *
     * Default: `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-insecureingest)
     * @param insecureIngest Whether the channel allows insecure RTMP ingest. 
     */
    override fun insecureIngest(insecureIngest: IResolvable) {
      cdkBuilder.insecureIngest(insecureIngest.let(IResolvable.Companion::unwrap))
    }

    /**
     * Ingest name.
     *
     * Default: - "-"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-name)
     * @param name Ingest name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * ARN of the stage with which the IngestConfiguration is associated.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-stagearn)
     * @param stageArn ARN of the stage with which the IngestConfiguration is associated. 
     */
    override fun stageArn(stageArn: String) {
      cdkBuilder.stageArn(stageArn)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Customer-assigned name to help identify the participant using the IngestConfiguration;
     *
     * this can be used to link a participant to a user in the customer’s own systems. This can be
     * any UTF-8 encoded text. *This field is exposed to all stage participants and should not be used
     * for personally identifying, confidential, or sensitive information.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-userid)
     * @param userId Customer-assigned name to help identify the participant using the
     * IngestConfiguration;. 
     */
    override fun userId(userId: String) {
      cdkBuilder.userId(userId)
    }

    public fun build(): software.amazon.awscdk.services.ivs.CfnIngestConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ivs.CfnIngestConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnIngestConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnIngestConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnIngestConfiguration):
        CfnIngestConfiguration = CfnIngestConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnIngestConfiguration):
        software.amazon.awscdk.services.ivs.CfnIngestConfiguration = wrapped.cdkObject as
        software.amazon.awscdk.services.ivs.CfnIngestConfiguration
  }
}
