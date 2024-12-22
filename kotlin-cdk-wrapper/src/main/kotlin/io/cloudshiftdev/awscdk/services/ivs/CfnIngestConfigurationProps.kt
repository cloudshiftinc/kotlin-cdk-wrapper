@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ivs

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

/**
 * Properties for defining a `CfnIngestConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ivs.*;
 * CfnIngestConfigurationProps cfnIngestConfigurationProps = CfnIngestConfigurationProps.builder()
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
public interface CfnIngestConfigurationProps {
  /**
   * Type of ingest protocol that the user employs for broadcasting.
   *
   * Default: - "RTMPS"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-ingestprotocol)
   */
  public fun ingestProtocol(): String? = unwrap(this).getIngestProtocol()

  /**
   * Whether the channel allows insecure RTMP ingest.
   *
   * Default: `false` .
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-insecureingest)
   */
  public fun insecureIngest(): Any? = unwrap(this).getInsecureIngest()

  /**
   * Ingest name.
   *
   * Default: - "-"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * ARN of the stage with which the IngestConfiguration is associated.
   *
   * Default: - ""
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-stagearn)
   */
  public fun stageArn(): String? = unwrap(this).getStageArn()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Customer-assigned name to help identify the participant using the IngestConfiguration;
   *
   * this can be used to link a participant to a user in the customer’s own systems. This can be any
   * UTF-8 encoded text. *This field is exposed to all stage participants and should not be used for
   * personally identifying, confidential, or sensitive information.*
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-userid)
   */
  public fun userId(): String? = unwrap(this).getUserId()

  /**
   * A builder for [CfnIngestConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param ingestProtocol Type of ingest protocol that the user employs for broadcasting.
     */
    public fun ingestProtocol(ingestProtocol: String)

    /**
     * @param insecureIngest Whether the channel allows insecure RTMP ingest.
     * Default: `false` .
     */
    public fun insecureIngest(insecureIngest: Boolean)

    /**
     * @param insecureIngest Whether the channel allows insecure RTMP ingest.
     * Default: `false` .
     */
    public fun insecureIngest(insecureIngest: IResolvable)

    /**
     * @param name Ingest name.
     */
    public fun name(name: String)

    /**
     * @param stageArn ARN of the stage with which the IngestConfiguration is associated.
     */
    public fun stageArn(stageArn: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param userId Customer-assigned name to help identify the participant using the
     * IngestConfiguration;.
     * this can be used to link a participant to a user in the customer’s own systems. This can be
     * any UTF-8 encoded text. *This field is exposed to all stage participants and should not be used
     * for personally identifying, confidential, or sensitive information.*
     */
    public fun userId(userId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ivs.CfnIngestConfigurationProps.Builder
        = software.amazon.awscdk.services.ivs.CfnIngestConfigurationProps.builder()

    /**
     * @param ingestProtocol Type of ingest protocol that the user employs for broadcasting.
     */
    override fun ingestProtocol(ingestProtocol: String) {
      cdkBuilder.ingestProtocol(ingestProtocol)
    }

    /**
     * @param insecureIngest Whether the channel allows insecure RTMP ingest.
     * Default: `false` .
     */
    override fun insecureIngest(insecureIngest: Boolean) {
      cdkBuilder.insecureIngest(insecureIngest)
    }

    /**
     * @param insecureIngest Whether the channel allows insecure RTMP ingest.
     * Default: `false` .
     */
    override fun insecureIngest(insecureIngest: IResolvable) {
      cdkBuilder.insecureIngest(insecureIngest.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param name Ingest name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param stageArn ARN of the stage with which the IngestConfiguration is associated.
     */
    override fun stageArn(stageArn: String) {
      cdkBuilder.stageArn(stageArn)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param userId Customer-assigned name to help identify the participant using the
     * IngestConfiguration;.
     * this can be used to link a participant to a user in the customer’s own systems. This can be
     * any UTF-8 encoded text. *This field is exposed to all stage participants and should not be used
     * for personally identifying, confidential, or sensitive information.*
     */
    override fun userId(userId: String) {
      cdkBuilder.userId(userId)
    }

    public fun build(): software.amazon.awscdk.services.ivs.CfnIngestConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ivs.CfnIngestConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnIngestConfigurationProps {
    /**
     * Type of ingest protocol that the user employs for broadcasting.
     *
     * Default: - "RTMPS"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-ingestprotocol)
     */
    override fun ingestProtocol(): String? = unwrap(this).getIngestProtocol()

    /**
     * Whether the channel allows insecure RTMP ingest.
     *
     * Default: `false` .
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-insecureingest)
     */
    override fun insecureIngest(): Any? = unwrap(this).getInsecureIngest()

    /**
     * Ingest name.
     *
     * Default: - "-"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * ARN of the stage with which the IngestConfiguration is associated.
     *
     * Default: - ""
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-stagearn)
     */
    override fun stageArn(): String? = unwrap(this).getStageArn()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Customer-assigned name to help identify the participant using the IngestConfiguration;
     *
     * this can be used to link a participant to a user in the customer’s own systems. This can be
     * any UTF-8 encoded text. *This field is exposed to all stage participants and should not be used
     * for personally identifying, confidential, or sensitive information.*
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ivs-ingestconfiguration.html#cfn-ivs-ingestconfiguration-userid)
     */
    override fun userId(): String? = unwrap(this).getUserId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnIngestConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ivs.CfnIngestConfigurationProps):
        CfnIngestConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnIngestConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnIngestConfigurationProps):
        software.amazon.awscdk.services.ivs.CfnIngestConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ivs.CfnIngestConfigurationProps
  }
}
