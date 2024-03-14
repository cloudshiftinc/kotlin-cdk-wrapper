package io.cloudshiftdev.awscdk.services.groundstation

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnConfigProps {
  /**
   * Object containing the parameters of a config.
   *
   * Only one subtype may be specified per config. See the subtype definitions for a description of
   * each config subtype.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-configdata)
   */
  public fun configData(): Any

  /**
   * The name of the config object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-name)
   */
  public fun name(): String

  /**
   * Tags assigned to a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configData Object containing the parameters of a config. 
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     */
    public fun configData(configData: IResolvable)

    /**
     * @param configData Object containing the parameters of a config. 
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     */
    public fun configData(configData: CfnConfig.ConfigDataProperty)

    /**
     * @param configData Object containing the parameters of a config. 
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb3aa406290fe9e03b6d375c472620e0af2bd3dcd2531c9dc5b24304c0018eea")
    public fun configData(configData: CfnConfig.ConfigDataProperty.Builder.() -> Unit)

    /**
     * @param name The name of the config object. 
     */
    public fun name(name: String)

    /**
     * @param tags Tags assigned to a resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags assigned to a resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.groundstation.CfnConfigProps.Builder =
        software.amazon.awscdk.services.groundstation.CfnConfigProps.builder()

    /**
     * @param configData Object containing the parameters of a config. 
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     */
    override fun configData(configData: IResolvable) {
      cdkBuilder.configData(configData.let(IResolvable::unwrap))
    }

    /**
     * @param configData Object containing the parameters of a config. 
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     */
    override fun configData(configData: CfnConfig.ConfigDataProperty) {
      cdkBuilder.configData(configData.let(CfnConfig.ConfigDataProperty::unwrap))
    }

    /**
     * @param configData Object containing the parameters of a config. 
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb3aa406290fe9e03b6d375c472620e0af2bd3dcd2531c9dc5b24304c0018eea")
    override fun configData(configData: CfnConfig.ConfigDataProperty.Builder.() -> Unit): Unit =
        configData(CfnConfig.ConfigDataProperty(configData))

    /**
     * @param name The name of the config object. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Tags assigned to a resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Tags assigned to a resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.groundstation.CfnConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.groundstation.CfnConfigProps,
  ) : CdkObject(cdkObject), CfnConfigProps {
    /**
     * Object containing the parameters of a config.
     *
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-configdata)
     */
    override fun configData(): Any = unwrap(this).getConfigData()

    /**
     * The name of the config object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfigProps):
        CfnConfigProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigProps):
        software.amazon.awscdk.services.groundstation.CfnConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.groundstation.CfnConfigProps
  }
}
