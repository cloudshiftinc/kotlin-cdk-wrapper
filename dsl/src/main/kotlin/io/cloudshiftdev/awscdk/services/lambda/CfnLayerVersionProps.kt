package io.cloudshiftdev.awscdk.services.lambda

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLayerVersionProps {
  /**
   * A list of compatible [instruction set
   * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatiblearchitectures)
   */
  public fun compatibleArchitectures(): List<String> = unwrap(this).getCompatibleArchitectures() ?:
      emptyList()

  /**
   * A list of compatible [function
   * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for filtering
   * with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html) and
   * [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html) .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatibleruntimes)
   */
  public fun compatibleRuntimes(): List<String> = unwrap(this).getCompatibleRuntimes() ?:
      emptyList()

  /**
   * The function layer archive.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-content)
   */
  public fun content(): Any

  /**
   * The description of the version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name or Amazon Resource Name (ARN) of the layer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-layername)
   */
  public fun layerName(): String? = unwrap(this).getLayerName()

  /**
   * The layer's software license. It can be any of the following:.
   *
   * * An [SPDX license identifier](https://docs.aws.amazon.com/https://spdx.org/licenses/) . For
   * example, `MIT` .
   * * The URL of a license hosted on the internet. For example,
   * `https://opensource.org/licenses/MIT` .
   * * The full text of the license.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-licenseinfo)
   */
  public fun licenseInfo(): String? = unwrap(this).getLicenseInfo()

  /**
   * A builder for [CfnLayerVersionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param compatibleArchitectures A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
     */
    public fun compatibleArchitectures(compatibleArchitectures: List<String>)

    /**
     * @param compatibleArchitectures A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
     */
    public fun compatibleArchitectures(vararg compatibleArchitectures: String)

    /**
     * @param compatibleRuntimes A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * .
     */
    public fun compatibleRuntimes(compatibleRuntimes: List<String>)

    /**
     * @param compatibleRuntimes A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * .
     */
    public fun compatibleRuntimes(vararg compatibleRuntimes: String)

    /**
     * @param content The function layer archive. 
     */
    public fun content(content: IResolvable)

    /**
     * @param content The function layer archive. 
     */
    public fun content(content: CfnLayerVersion.ContentProperty)

    /**
     * @param content The function layer archive. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bae529f363aeb8b4c5debaa82d1e51cef6f02933dcb12bd48296c3a9a130d9b")
    public fun content(content: CfnLayerVersion.ContentProperty.Builder.() -> Unit)

    /**
     * @param description The description of the version.
     */
    public fun description(description: String)

    /**
     * @param layerName The name or Amazon Resource Name (ARN) of the layer.
     */
    public fun layerName(layerName: String)

    /**
     * @param licenseInfo The layer's software license. It can be any of the following:.
     * * An [SPDX license identifier](https://docs.aws.amazon.com/https://spdx.org/licenses/) . For
     * example, `MIT` .
     * * The URL of a license hosted on the internet. For example,
     * `https://opensource.org/licenses/MIT` .
     * * The full text of the license.
     */
    public fun licenseInfo(licenseInfo: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lambda.CfnLayerVersionProps.Builder =
        software.amazon.awscdk.services.lambda.CfnLayerVersionProps.builder()

    /**
     * @param compatibleArchitectures A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
     */
    override fun compatibleArchitectures(compatibleArchitectures: List<String>) {
      cdkBuilder.compatibleArchitectures(compatibleArchitectures)
    }

    /**
     * @param compatibleArchitectures A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
     */
    override fun compatibleArchitectures(vararg compatibleArchitectures: String): Unit =
        compatibleArchitectures(compatibleArchitectures.toList())

    /**
     * @param compatibleRuntimes A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * .
     */
    override fun compatibleRuntimes(compatibleRuntimes: List<String>) {
      cdkBuilder.compatibleRuntimes(compatibleRuntimes)
    }

    /**
     * @param compatibleRuntimes A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * .
     */
    override fun compatibleRuntimes(vararg compatibleRuntimes: String): Unit =
        compatibleRuntimes(compatibleRuntimes.toList())

    /**
     * @param content The function layer archive. 
     */
    override fun content(content: IResolvable) {
      cdkBuilder.content(content.let(IResolvable::unwrap))
    }

    /**
     * @param content The function layer archive. 
     */
    override fun content(content: CfnLayerVersion.ContentProperty) {
      cdkBuilder.content(content.let(CfnLayerVersion.ContentProperty::unwrap))
    }

    /**
     * @param content The function layer archive. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7bae529f363aeb8b4c5debaa82d1e51cef6f02933dcb12bd48296c3a9a130d9b")
    override fun content(content: CfnLayerVersion.ContentProperty.Builder.() -> Unit): Unit =
        content(CfnLayerVersion.ContentProperty(content))

    /**
     * @param description The description of the version.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param layerName The name or Amazon Resource Name (ARN) of the layer.
     */
    override fun layerName(layerName: String) {
      cdkBuilder.layerName(layerName)
    }

    /**
     * @param licenseInfo The layer's software license. It can be any of the following:.
     * * An [SPDX license identifier](https://docs.aws.amazon.com/https://spdx.org/licenses/) . For
     * example, `MIT` .
     * * The URL of a license hosted on the internet. For example,
     * `https://opensource.org/licenses/MIT` .
     * * The full text of the license.
     */
    override fun licenseInfo(licenseInfo: String) {
      cdkBuilder.licenseInfo(licenseInfo)
    }

    public fun build(): software.amazon.awscdk.services.lambda.CfnLayerVersionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersionProps,
  ) : CdkObject(cdkObject), CfnLayerVersionProps {
    /**
     * A list of compatible [instruction set
     * architectures](https://docs.aws.amazon.com/lambda/latest/dg/foundation-arch.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatiblearchitectures)
     */
    override fun compatibleArchitectures(): List<String> = unwrap(this).getCompatibleArchitectures()
        ?: emptyList()

    /**
     * A list of compatible [function
     * runtimes](https://docs.aws.amazon.com/lambda/latest/dg/lambda-runtimes.html) . Used for
     * filtering with [ListLayers](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayers.html)
     * and [ListLayerVersions](https://docs.aws.amazon.com/lambda/latest/dg/API_ListLayerVersions.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatibleruntimes)
     */
    override fun compatibleRuntimes(): List<String> = unwrap(this).getCompatibleRuntimes() ?:
        emptyList()

    /**
     * The function layer archive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-content)
     */
    override fun content(): Any = unwrap(this).getContent()

    /**
     * The description of the version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name or Amazon Resource Name (ARN) of the layer.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-layername)
     */
    override fun layerName(): String? = unwrap(this).getLayerName()

    /**
     * The layer's software license. It can be any of the following:.
     *
     * * An [SPDX license identifier](https://docs.aws.amazon.com/https://spdx.org/licenses/) . For
     * example, `MIT` .
     * * The URL of a license hosted on the internet. For example,
     * `https://opensource.org/licenses/MIT` .
     * * The full text of the license.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-licenseinfo)
     */
    override fun licenseInfo(): String? = unwrap(this).getLicenseInfo()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLayerVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.CfnLayerVersionProps):
        CfnLayerVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLayerVersionProps):
        software.amazon.awscdk.services.lambda.CfnLayerVersionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lambda.CfnLayerVersionProps
  }
}
