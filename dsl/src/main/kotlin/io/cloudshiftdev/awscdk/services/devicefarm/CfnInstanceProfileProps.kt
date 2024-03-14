package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnInstanceProfileProps {
  /**
   * The description of the instance profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * An array of strings containing the list of app packages that should not be cleaned up from the
   * device after a test run completes.
   *
   * The list of packages is considered only if you set `packageCleanup` to `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-excludeapppackagesfromcleanup)
   */
  public fun excludeAppPackagesFromCleanup(): List<String> =
      unwrap(this).getExcludeAppPackagesFromCleanup() ?: emptyList()

  /**
   * The name of the instance profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-name)
   */
  public fun name(): String

  /**
   * When set to `true` , Device Farm removes app packages after a test run.
   *
   * The default value is `false` for private devices.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-packagecleanup)
   */
  public fun packageCleanup(): Any? = unwrap(this).getPackageCleanup()

  /**
   * When set to `true` , Device Farm reboots the instance after a test run.
   *
   * The default value is `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-rebootafteruse)
   */
  public fun rebootAfterUse(): Any? = unwrap(this).getRebootAfterUse()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnInstanceProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the instance profile.
     */
    public fun description(description: String)

    /**
     * @param excludeAppPackagesFromCleanup An array of strings containing the list of app packages
     * that should not be cleaned up from the device after a test run completes.
     * The list of packages is considered only if you set `packageCleanup` to `true` .
     */
    public fun excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup: List<String>)

    /**
     * @param excludeAppPackagesFromCleanup An array of strings containing the list of app packages
     * that should not be cleaned up from the device after a test run completes.
     * The list of packages is considered only if you set `packageCleanup` to `true` .
     */
    public fun excludeAppPackagesFromCleanup(vararg excludeAppPackagesFromCleanup: String)

    /**
     * @param name The name of the instance profile. 
     */
    public fun name(name: String)

    /**
     * @param packageCleanup When set to `true` , Device Farm removes app packages after a test run.
     * The default value is `false` for private devices.
     */
    public fun packageCleanup(packageCleanup: Boolean)

    /**
     * @param packageCleanup When set to `true` , Device Farm removes app packages after a test run.
     * The default value is `false` for private devices.
     */
    public fun packageCleanup(packageCleanup: IResolvable)

    /**
     * @param rebootAfterUse When set to `true` , Device Farm reboots the instance after a test run.
     * The default value is `true` .
     */
    public fun rebootAfterUse(rebootAfterUse: Boolean)

    /**
     * @param rebootAfterUse When set to `true` , Device Farm reboots the instance after a test run.
     * The default value is `true` .
     */
    public fun rebootAfterUse(rebootAfterUse: IResolvable)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps.Builder =
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps.builder()

    /**
     * @param description The description of the instance profile.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param excludeAppPackagesFromCleanup An array of strings containing the list of app packages
     * that should not be cleaned up from the device after a test run completes.
     * The list of packages is considered only if you set `packageCleanup` to `true` .
     */
    override fun excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup: List<String>) {
      cdkBuilder.excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup)
    }

    /**
     * @param excludeAppPackagesFromCleanup An array of strings containing the list of app packages
     * that should not be cleaned up from the device after a test run completes.
     * The list of packages is considered only if you set `packageCleanup` to `true` .
     */
    override fun excludeAppPackagesFromCleanup(vararg excludeAppPackagesFromCleanup: String): Unit =
        excludeAppPackagesFromCleanup(excludeAppPackagesFromCleanup.toList())

    /**
     * @param name The name of the instance profile. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param packageCleanup When set to `true` , Device Farm removes app packages after a test run.
     * The default value is `false` for private devices.
     */
    override fun packageCleanup(packageCleanup: Boolean) {
      cdkBuilder.packageCleanup(packageCleanup)
    }

    /**
     * @param packageCleanup When set to `true` , Device Farm removes app packages after a test run.
     * The default value is `false` for private devices.
     */
    override fun packageCleanup(packageCleanup: IResolvable) {
      cdkBuilder.packageCleanup(packageCleanup.let(IResolvable::unwrap))
    }

    /**
     * @param rebootAfterUse When set to `true` , Device Farm reboots the instance after a test run.
     * The default value is `true` .
     */
    override fun rebootAfterUse(rebootAfterUse: Boolean) {
      cdkBuilder.rebootAfterUse(rebootAfterUse)
    }

    /**
     * @param rebootAfterUse When set to `true` , Device Farm reboots the instance after a test run.
     * The default value is `true` .
     */
    override fun rebootAfterUse(rebootAfterUse: IResolvable) {
      cdkBuilder.rebootAfterUse(rebootAfterUse.let(IResolvable::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps,
  ) : CdkObject(cdkObject), CfnInstanceProfileProps {
    /**
     * The description of the instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * An array of strings containing the list of app packages that should not be cleaned up from
     * the device after a test run completes.
     *
     * The list of packages is considered only if you set `packageCleanup` to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-excludeapppackagesfromcleanup)
     */
    override fun excludeAppPackagesFromCleanup(): List<String> =
        unwrap(this).getExcludeAppPackagesFromCleanup() ?: emptyList()

    /**
     * The name of the instance profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * When set to `true` , Device Farm removes app packages after a test run.
     *
     * The default value is `false` for private devices.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-packagecleanup)
     */
    override fun packageCleanup(): Any? = unwrap(this).getPackageCleanup()

    /**
     * When set to `true` , Device Farm reboots the instance after a test run.
     *
     * The default value is `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-rebootafteruse)
     */
    override fun rebootAfterUse(): Any? = unwrap(this).getRebootAfterUse()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-instanceprofile.html#cfn-devicefarm-instanceprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnInstanceProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps):
        CfnInstanceProfileProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInstanceProfileProps):
        software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.devicefarm.CfnInstanceProfileProps
  }
}
