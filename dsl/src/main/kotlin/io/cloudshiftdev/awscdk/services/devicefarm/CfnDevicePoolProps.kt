package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnDevicePoolProps {
  /**
   * The device pool's description.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The number of devices that Device Farm can add to your device pool.
   *
   * Device Farm adds devices that are available and meet the criteria that you assign for the
   * `rules` parameter. Depending on how many devices meet these constraints, your device pool might
   * contain fewer devices than the value for this parameter.
   *
   * By specifying the maximum number of devices, you can control the costs that you incur by
   * running tests.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-maxdevices)
   */
  public fun maxDevices(): Number? = unwrap(this).getMaxDevices()

  /**
   * The device pool's name.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-name)
   */
  public fun name(): String

  /**
   * The ARN of the project for the device pool.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-projectarn)
   */
  public fun projectArn(): String

  /**
   * The device pool's rules.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-rules)
   */
  public fun rules(): Any

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDevicePoolProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The device pool's description.
     */
    public fun description(description: String)

    /**
     * @param maxDevices The number of devices that Device Farm can add to your device pool.
     * Device Farm adds devices that are available and meet the criteria that you assign for the
     * `rules` parameter. Depending on how many devices meet these constraints, your device pool might
     * contain fewer devices than the value for this parameter.
     *
     * By specifying the maximum number of devices, you can control the costs that you incur by
     * running tests.
     */
    public fun maxDevices(maxDevices: Number)

    /**
     * @param name The device pool's name. 
     */
    public fun name(name: String)

    /**
     * @param projectArn The ARN of the project for the device pool. 
     */
    public fun projectArn(projectArn: String)

    /**
     * @param rules The device pool's rules. 
     */
    public fun rules(rules: IResolvable)

    /**
     * @param rules The device pool's rules. 
     */
    public fun rules(rules: List<Any>)

    /**
     * @param rules The device pool's rules. 
     */
    public fun rules(vararg rules: Any)

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
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps.Builder =
        software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps.builder()

    /**
     * @param description The device pool's description.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param maxDevices The number of devices that Device Farm can add to your device pool.
     * Device Farm adds devices that are available and meet the criteria that you assign for the
     * `rules` parameter. Depending on how many devices meet these constraints, your device pool might
     * contain fewer devices than the value for this parameter.
     *
     * By specifying the maximum number of devices, you can control the costs that you incur by
     * running tests.
     */
    override fun maxDevices(maxDevices: Number) {
      cdkBuilder.maxDevices(maxDevices)
    }

    /**
     * @param name The device pool's name. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param projectArn The ARN of the project for the device pool. 
     */
    override fun projectArn(projectArn: String) {
      cdkBuilder.projectArn(projectArn)
    }

    /**
     * @param rules The device pool's rules. 
     */
    override fun rules(rules: IResolvable) {
      cdkBuilder.rules(rules.let(IResolvable::unwrap))
    }

    /**
     * @param rules The device pool's rules. 
     */
    override fun rules(rules: List<Any>) {
      cdkBuilder.rules(rules)
    }

    /**
     * @param rules The device pool's rules. 
     */
    override fun rules(vararg rules: Any): Unit = rules(rules.toList())

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

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps,
  ) : CdkObject(cdkObject), CfnDevicePoolProps {
    /**
     * The device pool's description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The number of devices that Device Farm can add to your device pool.
     *
     * Device Farm adds devices that are available and meet the criteria that you assign for the
     * `rules` parameter. Depending on how many devices meet these constraints, your device pool might
     * contain fewer devices than the value for this parameter.
     *
     * By specifying the maximum number of devices, you can control the costs that you incur by
     * running tests.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-maxdevices)
     */
    override fun maxDevices(): Number? = unwrap(this).getMaxDevices()

    /**
     * The device pool's name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The ARN of the project for the device pool.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-projectarn)
     */
    override fun projectArn(): String = unwrap(this).getProjectArn()

    /**
     * The device pool's rules.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-rules)
     */
    override fun rules(): Any = unwrap(this).getRules()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-devicepool.html#cfn-devicefarm-devicepool-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDevicePoolProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps):
        CfnDevicePoolProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDevicePoolProps):
        software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.devicefarm.CfnDevicePoolProps
  }
}
