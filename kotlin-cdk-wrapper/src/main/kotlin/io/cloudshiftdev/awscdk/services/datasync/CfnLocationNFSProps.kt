@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnLocationNFS`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.datasync.*;
 * CfnLocationNFSProps cfnLocationNFSProps = CfnLocationNFSProps.builder()
 * .onPremConfig(OnPremConfigProperty.builder()
 * .agentArns(List.of("agentArns"))
 * .build())
 * // the properties below are optional
 * .mountOptions(MountOptionsProperty.builder()
 * .version("version")
 * .build())
 * .serverHostname("serverHostname")
 * .subdirectory("subdirectory")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html)
 */
public interface CfnLocationNFSProps {
  /**
   * Specifies the options that DataSync can use to mount your NFS file server.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-mountoptions)
   */
  public fun mountOptions(): Any? = unwrap(this).getMountOptions()

  /**
   * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your NFS
   * file server.
   *
   * You can specify more than one agent. For more information, see [Using multiple agents for
   * transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-onpremconfig)
   */
  public fun onPremConfig(): Any

  /**
   * Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file server that
   * your DataSync agent connects to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-serverhostname)
   */
  public fun serverHostname(): String? = unwrap(this).getServerHostname()

  /**
   * Specifies the export path in your NFS file server that you want DataSync to mount.
   *
   * This path (or a subdirectory of the path) is where DataSync transfers data to or from. For
   * information on configuring an export for DataSync, see [Accessing NFS file
   * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-subdirectory)
   */
  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnLocationNFSProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
     * server.
     */
    public fun mountOptions(mountOptions: IResolvable)

    /**
     * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
     * server.
     */
    public fun mountOptions(mountOptions: CfnLocationNFS.MountOptionsProperty)

    /**
     * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
     * server.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af2ade05506e8da744ab6e04cee81561c74cfcea080d6befd6556fb2cadfc3e7")
    public fun mountOptions(mountOptions: CfnLocationNFS.MountOptionsProperty.Builder.() -> Unit)

    /**
     * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that want
     * to connect to your NFS file server. 
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     */
    public fun onPremConfig(onPremConfig: IResolvable)

    /**
     * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that want
     * to connect to your NFS file server. 
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     */
    public fun onPremConfig(onPremConfig: CfnLocationNFS.OnPremConfigProperty)

    /**
     * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that want
     * to connect to your NFS file server. 
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf5703597528879642bf94644d82f6db8aa573618543415d79049ad5e417fa05")
    public fun onPremConfig(onPremConfig: CfnLocationNFS.OnPremConfigProperty.Builder.() -> Unit)

    /**
     * @param serverHostname Specifies the Domain Name System (DNS) name or IP version 4 address of
     * the NFS file server that your DataSync agent connects to.
     */
    public fun serverHostname(serverHostname: String)

    /**
     * @param subdirectory Specifies the export path in your NFS file server that you want DataSync
     * to mount.
     * This path (or a subdirectory of the path) is where DataSync transfers data to or from. For
     * information on configuring an export for DataSync, see [Accessing NFS file
     * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs)
     * .
     */
    public fun subdirectory(subdirectory: String)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationNFSProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationNFSProps.builder()

    /**
     * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
     * server.
     */
    override fun mountOptions(mountOptions: IResolvable) {
      cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
    }

    /**
     * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
     * server.
     */
    override fun mountOptions(mountOptions: CfnLocationNFS.MountOptionsProperty) {
      cdkBuilder.mountOptions(mountOptions.let(CfnLocationNFS.MountOptionsProperty::unwrap))
    }

    /**
     * @param mountOptions Specifies the options that DataSync can use to mount your NFS file
     * server.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af2ade05506e8da744ab6e04cee81561c74cfcea080d6befd6556fb2cadfc3e7")
    override fun mountOptions(mountOptions: CfnLocationNFS.MountOptionsProperty.Builder.() -> Unit):
        Unit = mountOptions(CfnLocationNFS.MountOptionsProperty(mountOptions))

    /**
     * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that want
     * to connect to your NFS file server. 
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     */
    override fun onPremConfig(onPremConfig: IResolvable) {
      cdkBuilder.onPremConfig(onPremConfig.let(IResolvable::unwrap))
    }

    /**
     * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that want
     * to connect to your NFS file server. 
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     */
    override fun onPremConfig(onPremConfig: CfnLocationNFS.OnPremConfigProperty) {
      cdkBuilder.onPremConfig(onPremConfig.let(CfnLocationNFS.OnPremConfigProperty::unwrap))
    }

    /**
     * @param onPremConfig Specifies the Amazon Resource Name (ARN) of the DataSync agent that want
     * to connect to your NFS file server. 
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf5703597528879642bf94644d82f6db8aa573618543415d79049ad5e417fa05")
    override fun onPremConfig(onPremConfig: CfnLocationNFS.OnPremConfigProperty.Builder.() -> Unit):
        Unit = onPremConfig(CfnLocationNFS.OnPremConfigProperty(onPremConfig))

    /**
     * @param serverHostname Specifies the Domain Name System (DNS) name or IP version 4 address of
     * the NFS file server that your DataSync agent connects to.
     */
    override fun serverHostname(serverHostname: String) {
      cdkBuilder.serverHostname(serverHostname)
    }

    /**
     * @param subdirectory Specifies the export path in your NFS file server that you want DataSync
     * to mount.
     * This path (or a subdirectory of the path) is where DataSync transfers data to or from. For
     * information on configuring an export for DataSync, see [Accessing NFS file
     * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs)
     * .
     */
    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your location.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationNFSProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.datasync.CfnLocationNFSProps,
  ) : CdkObject(cdkObject), CfnLocationNFSProps {
    /**
     * Specifies the options that DataSync can use to mount your NFS file server.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-mountoptions)
     */
    override fun mountOptions(): Any? = unwrap(this).getMountOptions()

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your
     * NFS file server.
     *
     * You can specify more than one agent. For more information, see [Using multiple agents for
     * transfers](https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-onpremconfig)
     */
    override fun onPremConfig(): Any = unwrap(this).getOnPremConfig()

    /**
     * Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file server
     * that your DataSync agent connects to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-serverhostname)
     */
    override fun serverHostname(): String? = unwrap(this).getServerHostname()

    /**
     * Specifies the export path in your NFS file server that you want DataSync to mount.
     *
     * This path (or a subdirectory of the path) is where DataSync transfers data to or from. For
     * information on configuring an export for DataSync, see [Accessing NFS file
     * servers](https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-subdirectory)
     */
    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-locationnfs.html#cfn-datasync-locationnfs-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationNFSProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationNFSProps):
        CfnLocationNFSProps = CdkObjectWrappers.wrap(cdkObject) as? CfnLocationNFSProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationNFSProps):
        software.amazon.awscdk.services.datasync.CfnLocationNFSProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationNFSProps
  }
}
