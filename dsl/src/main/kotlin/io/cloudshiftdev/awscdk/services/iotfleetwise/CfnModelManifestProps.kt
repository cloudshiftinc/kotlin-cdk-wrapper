package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnModelManifestProps {
  /**
   * (Optional) A brief description of the vehicle model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the vehicle model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-name)
   */
  public fun name(): String

  /**
   * (Optional) A list of nodes, which are a general abstraction of signals.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-nodes)
   */
  public fun nodes(): List<String> = unwrap(this).getNodes() ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of the signal catalog associated with the vehicle model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-signalcatalogarn)
   */
  public fun signalCatalogArn(): String

  /**
   * (Optional) The state of the vehicle model.
   *
   * If the status is `ACTIVE` , the vehicle model can't be edited. If the status is `DRAFT` , you
   * can edit the vehicle model.
   *
   * Default: - "DRAFT"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * (Optional) Metadata that can be used to manage the vehicle model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnModelManifestProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description (Optional) A brief description of the vehicle model.
     */
    public fun description(description: String)

    /**
     * @param name The name of the vehicle model. 
     */
    public fun name(name: String)

    /**
     * @param nodes (Optional) A list of nodes, which are a general abstraction of signals.
     */
    public fun nodes(nodes: List<String>)

    /**
     * @param nodes (Optional) A list of nodes, which are a general abstraction of signals.
     */
    public fun nodes(vararg nodes: String)

    /**
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     * the vehicle model. 
     */
    public fun signalCatalogArn(signalCatalogArn: String)

    /**
     * @param status (Optional) The state of the vehicle model.
     * If the status is `ACTIVE` , the vehicle model can't be edited. If the status is `DRAFT` , you
     * can edit the vehicle model.
     */
    public fun status(status: String)

    /**
     * @param tags (Optional) Metadata that can be used to manage the vehicle model.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags (Optional) Metadata that can be used to manage the vehicle model.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps.builder()

    /**
     * @param description (Optional) A brief description of the vehicle model.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name of the vehicle model. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param nodes (Optional) A list of nodes, which are a general abstraction of signals.
     */
    override fun nodes(nodes: List<String>) {
      cdkBuilder.nodes(nodes)
    }

    /**
     * @param nodes (Optional) A list of nodes, which are a general abstraction of signals.
     */
    override fun nodes(vararg nodes: String): Unit = nodes(nodes.toList())

    /**
     * @param signalCatalogArn The Amazon Resource Name (ARN) of the signal catalog associated with
     * the vehicle model. 
     */
    override fun signalCatalogArn(signalCatalogArn: String) {
      cdkBuilder.signalCatalogArn(signalCatalogArn)
    }

    /**
     * @param status (Optional) The state of the vehicle model.
     * If the status is `ACTIVE` , the vehicle model can't be edited. If the status is `DRAFT` , you
     * can edit the vehicle model.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags (Optional) Metadata that can be used to manage the vehicle model.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags (Optional) Metadata that can be used to manage the vehicle model.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps,
  ) : CdkObject(cdkObject), CfnModelManifestProps {
    /**
     * (Optional) A brief description of the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * (Optional) A list of nodes, which are a general abstraction of signals.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-nodes)
     */
    override fun nodes(): List<String> = unwrap(this).getNodes() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the signal catalog associated with the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-signalcatalogarn)
     */
    override fun signalCatalogArn(): String = unwrap(this).getSignalCatalogArn()

    /**
     * (Optional) The state of the vehicle model.
     *
     * If the status is `ACTIVE` , the vehicle model can't be edited. If the status is `DRAFT` , you
     * can edit the vehicle model.
     *
     * Default: - "DRAFT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * (Optional) Metadata that can be used to manage the vehicle model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-modelmanifest.html#cfn-iotfleetwise-modelmanifest-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnModelManifestProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps):
        CfnModelManifestProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnModelManifestProps):
        software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotfleetwise.CfnModelManifestProps
  }
}
