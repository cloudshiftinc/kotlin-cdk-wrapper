@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.gamelift

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
 * Properties for defining a `CfnBuild`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.gamelift.*;
 * CfnBuildProps cfnBuildProps = CfnBuildProps.builder()
 * .name("name")
 * .operatingSystem("operatingSystem")
 * .serverSdkVersion("serverSdkVersion")
 * .storageLocation(StorageLocationProperty.builder()
 * .bucket("bucket")
 * .key("key")
 * .roleArn("roleArn")
 * // the properties below are optional
 * .objectVersion("objectVersion")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .version("version")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html)
 */
public interface CfnBuildProps {
  /**
   * A descriptive label that is associated with a build.
   *
   * Build names do not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The operating system that your game server binaries run on.
   *
   * This value determines the type of fleet resources that you use for this build. If your game
   * build contains multiple executables, they all must run on the same operating system. You must
   * specify a valid operating system in this request. There is no default value. You can't change a
   * build's operating system later.
   *
   *
   * Amazon Linux 2 (AL2) will reach end of support on 6/30/2025. See more details in the [Amazon
   * Linux 2 FAQs](https://docs.aws.amazon.com/amazon-linux-2/faqs/) . For game servers that are hosted
   * on AL2 and use server SDK version 4.x for Amazon GameLift Servers, first update the game server
   * build to server SDK 5.x, and then deploy to AL2023 instances. See [Migrate to server SDK version
   * 5.](https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk5-migration.html)
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-operatingsystem)
   */
  public fun operatingSystem(): String? = unwrap(this).getOperatingSystem()

  /**
   * A server SDK version you used when integrating your game server build with Amazon GameLift
   * Servers.
   *
   * For more information see [Integrate games with custom game
   * servers](https://docs.aws.amazon.com/gamelift/latest/developerguide/integration-custom-intro.html)
   * . By default Amazon GameLift Servers sets this value to `4.0.2` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-serversdkversion)
   */
  public fun serverSdkVersion(): String? = unwrap(this).getServerSdkVersion()

  /**
   * Information indicating where your game build files are stored.
   *
   * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that you
   * own. The storage location must specify an Amazon S3 bucket name and key. The location must also
   * specify a role ARN that you set up to allow Amazon GameLift Servers to access your Amazon S3
   * bucket. The S3 bucket and your new build must be in the same Region.
   *
   * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
   * bucket. Amazon GameLift Servers will report a `SizeOnDisk` of 0.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
   */
  public fun storageLocation(): Any? = unwrap(this).getStorageLocation()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Version information that is associated with this build.
   *
   * Version strings do not need to be unique.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-version)
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [CfnBuildProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name A descriptive label that is associated with a build.
     * Build names do not need to be unique.
     */
    public fun name(name: String)

    /**
     * @param operatingSystem The operating system that your game server binaries run on.
     * This value determines the type of fleet resources that you use for this build. If your game
     * build contains multiple executables, they all must run on the same operating system. You must
     * specify a valid operating system in this request. There is no default value. You can't change a
     * build's operating system later.
     *
     *
     * Amazon Linux 2 (AL2) will reach end of support on 6/30/2025. See more details in the [Amazon
     * Linux 2 FAQs](https://docs.aws.amazon.com/amazon-linux-2/faqs/) . For game servers that are
     * hosted on AL2 and use server SDK version 4.x for Amazon GameLift Servers, first update the game
     * server build to server SDK 5.x, and then deploy to AL2023 instances. See [Migrate to server SDK
     * version
     * 5.](https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk5-migration.html)
     */
    public fun operatingSystem(operatingSystem: String)

    /**
     * @param serverSdkVersion A server SDK version you used when integrating your game server build
     * with Amazon GameLift Servers.
     * For more information see [Integrate games with custom game
     * servers](https://docs.aws.amazon.com/gamelift/latest/developerguide/integration-custom-intro.html)
     * . By default Amazon GameLift Servers sets this value to `4.0.2` .
     */
    public fun serverSdkVersion(serverSdkVersion: String)

    /**
     * @param storageLocation Information indicating where your game build files are stored.
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift Servers to access your Amazon
     * S3 bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift Servers will report a `SizeOnDisk` of 0.
     */
    public fun storageLocation(storageLocation: IResolvable)

    /**
     * @param storageLocation Information indicating where your game build files are stored.
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift Servers to access your Amazon
     * S3 bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift Servers will report a `SizeOnDisk` of 0.
     */
    public fun storageLocation(storageLocation: CfnBuild.StorageLocationProperty)

    /**
     * @param storageLocation Information indicating where your game build files are stored.
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift Servers to access your Amazon
     * S3 bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift Servers will report a `SizeOnDisk` of 0.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16e93302b0d4d7df4342d00e95ceea9a860bfefd728bf485b18ccbc28c2c88be")
    public fun storageLocation(storageLocation: CfnBuild.StorageLocationProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param version Version information that is associated with this build.
     * Version strings do not need to be unique.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.gamelift.CfnBuildProps.Builder =
        software.amazon.awscdk.services.gamelift.CfnBuildProps.builder()

    /**
     * @param name A descriptive label that is associated with a build.
     * Build names do not need to be unique.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param operatingSystem The operating system that your game server binaries run on.
     * This value determines the type of fleet resources that you use for this build. If your game
     * build contains multiple executables, they all must run on the same operating system. You must
     * specify a valid operating system in this request. There is no default value. You can't change a
     * build's operating system later.
     *
     *
     * Amazon Linux 2 (AL2) will reach end of support on 6/30/2025. See more details in the [Amazon
     * Linux 2 FAQs](https://docs.aws.amazon.com/amazon-linux-2/faqs/) . For game servers that are
     * hosted on AL2 and use server SDK version 4.x for Amazon GameLift Servers, first update the game
     * server build to server SDK 5.x, and then deploy to AL2023 instances. See [Migrate to server SDK
     * version
     * 5.](https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk5-migration.html)
     */
    override fun operatingSystem(operatingSystem: String) {
      cdkBuilder.operatingSystem(operatingSystem)
    }

    /**
     * @param serverSdkVersion A server SDK version you used when integrating your game server build
     * with Amazon GameLift Servers.
     * For more information see [Integrate games with custom game
     * servers](https://docs.aws.amazon.com/gamelift/latest/developerguide/integration-custom-intro.html)
     * . By default Amazon GameLift Servers sets this value to `4.0.2` .
     */
    override fun serverSdkVersion(serverSdkVersion: String) {
      cdkBuilder.serverSdkVersion(serverSdkVersion)
    }

    /**
     * @param storageLocation Information indicating where your game build files are stored.
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift Servers to access your Amazon
     * S3 bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift Servers will report a `SizeOnDisk` of 0.
     */
    override fun storageLocation(storageLocation: IResolvable) {
      cdkBuilder.storageLocation(storageLocation.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param storageLocation Information indicating where your game build files are stored.
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift Servers to access your Amazon
     * S3 bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift Servers will report a `SizeOnDisk` of 0.
     */
    override fun storageLocation(storageLocation: CfnBuild.StorageLocationProperty) {
      cdkBuilder.storageLocation(storageLocation.let(CfnBuild.StorageLocationProperty.Companion::unwrap))
    }

    /**
     * @param storageLocation Information indicating where your game build files are stored.
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift Servers to access your Amazon
     * S3 bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift Servers will report a `SizeOnDisk` of 0.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("16e93302b0d4d7df4342d00e95ceea9a860bfefd728bf485b18ccbc28c2c88be")
    override
        fun storageLocation(storageLocation: CfnBuild.StorageLocationProperty.Builder.() -> Unit):
        Unit = storageLocation(CfnBuild.StorageLocationProperty(storageLocation))

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
     * @param version Version information that is associated with this build.
     * Version strings do not need to be unique.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.gamelift.CfnBuildProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.gamelift.CfnBuildProps,
  ) : CdkObject(cdkObject),
      CfnBuildProps {
    /**
     * A descriptive label that is associated with a build.
     *
     * Build names do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The operating system that your game server binaries run on.
     *
     * This value determines the type of fleet resources that you use for this build. If your game
     * build contains multiple executables, they all must run on the same operating system. You must
     * specify a valid operating system in this request. There is no default value. You can't change a
     * build's operating system later.
     *
     *
     * Amazon Linux 2 (AL2) will reach end of support on 6/30/2025. See more details in the [Amazon
     * Linux 2 FAQs](https://docs.aws.amazon.com/amazon-linux-2/faqs/) . For game servers that are
     * hosted on AL2 and use server SDK version 4.x for Amazon GameLift Servers, first update the game
     * server build to server SDK 5.x, and then deploy to AL2023 instances. See [Migrate to server SDK
     * version
     * 5.](https://docs.aws.amazon.com/gamelift/latest/developerguide/reference-serversdk5-migration.html)
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-operatingsystem)
     */
    override fun operatingSystem(): String? = unwrap(this).getOperatingSystem()

    /**
     * A server SDK version you used when integrating your game server build with Amazon GameLift
     * Servers.
     *
     * For more information see [Integrate games with custom game
     * servers](https://docs.aws.amazon.com/gamelift/latest/developerguide/integration-custom-intro.html)
     * . By default Amazon GameLift Servers sets this value to `4.0.2` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-serversdkversion)
     */
    override fun serverSdkVersion(): String? = unwrap(this).getServerSdkVersion()

    /**
     * Information indicating where your game build files are stored.
     *
     * Use this parameter only when creating a build with files stored in an Amazon S3 bucket that
     * you own. The storage location must specify an Amazon S3 bucket name and key. The location must
     * also specify a role ARN that you set up to allow Amazon GameLift Servers to access your Amazon
     * S3 bucket. The S3 bucket and your new build must be in the same Region.
     *
     * If a `StorageLocation` is specified, the size of your file can be found in your Amazon S3
     * bucket. Amazon GameLift Servers will report a `SizeOnDisk` of 0.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-storagelocation)
     */
    override fun storageLocation(): Any? = unwrap(this).getStorageLocation()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Version information that is associated with this build.
     *
     * Version strings do not need to be unique.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-build.html#cfn-gamelift-build-version)
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBuildProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.gamelift.CfnBuildProps):
        CfnBuildProps = CdkObjectWrappers.wrap(cdkObject) as? CfnBuildProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBuildProps):
        software.amazon.awscdk.services.gamelift.CfnBuildProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.gamelift.CfnBuildProps
  }
}
