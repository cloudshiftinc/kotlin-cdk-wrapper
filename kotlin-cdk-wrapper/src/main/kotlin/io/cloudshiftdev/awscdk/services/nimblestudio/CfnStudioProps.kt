@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.nimblestudio

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnStudio`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.nimblestudio.*;
 * CfnStudioProps cfnStudioProps = CfnStudioProps.builder()
 * .adminRoleArn("adminRoleArn")
 * .displayName("displayName")
 * .studioName("studioName")
 * .userRoleArn("userRoleArn")
 * // the properties below are optional
 * .studioEncryptionConfiguration(StudioEncryptionConfigurationProperty.builder()
 * .keyType("keyType")
 * // the properties below are optional
 * .keyArn("keyArn")
 * .build())
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html)
 */
public interface CfnStudioProps {
  /**
   * The IAM role that studio admins assume when logging in to the Nimble Studio portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-adminrolearn)
   */
  public fun adminRoleArn(): String

  /**
   * A friendly name for the studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-displayname)
   */
  public fun displayName(): String

  /**
   * Configuration of the encryption method that is used for the studio.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
   */
  public fun studioEncryptionConfiguration(): Any? = unwrap(this).getStudioEncryptionConfiguration()

  /**
   * The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioname)
   */
  public fun studioName(): String

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The IAM role that studio users assume when logging in to the Nimble Studio portal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-userrolearn)
   */
  public fun userRoleArn(): String

  /**
   * A builder for [CfnStudioProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param adminRoleArn The IAM role that studio admins assume when logging in to the Nimble
     * Studio portal. 
     */
    public fun adminRoleArn(adminRoleArn: String)

    /**
     * @param displayName A friendly name for the studio. 
     */
    public fun displayName(displayName: String)

    /**
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio.
     */
    public fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable)

    /**
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio.
     */
    public
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: CfnStudio.StudioEncryptionConfigurationProperty)

    /**
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7caf0fa4ac0667612130fefd40540c448a4f6784c9ff61c8ead116516175e58")
    public
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: CfnStudio.StudioEncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param studioName The name of the studio, as included in the URL when accessing it in the
     * Nimble Studio portal. 
     */
    public fun studioName(studioName: String)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param userRoleArn The IAM role that studio users assume when logging in to the Nimble Studio
     * portal. 
     */
    public fun userRoleArn(userRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.nimblestudio.CfnStudioProps.Builder =
        software.amazon.awscdk.services.nimblestudio.CfnStudioProps.builder()

    /**
     * @param adminRoleArn The IAM role that studio admins assume when logging in to the Nimble
     * Studio portal. 
     */
    override fun adminRoleArn(adminRoleArn: String) {
      cdkBuilder.adminRoleArn(adminRoleArn)
    }

    /**
     * @param displayName A friendly name for the studio. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio.
     */
    override fun studioEncryptionConfiguration(studioEncryptionConfiguration: IResolvable) {
      cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio.
     */
    override
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: CfnStudio.StudioEncryptionConfigurationProperty) {
      cdkBuilder.studioEncryptionConfiguration(studioEncryptionConfiguration.let(CfnStudio.StudioEncryptionConfigurationProperty::unwrap))
    }

    /**
     * @param studioEncryptionConfiguration Configuration of the encryption method that is used for
     * the studio.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7caf0fa4ac0667612130fefd40540c448a4f6784c9ff61c8ead116516175e58")
    override
        fun studioEncryptionConfiguration(studioEncryptionConfiguration: CfnStudio.StudioEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        studioEncryptionConfiguration(CfnStudio.StudioEncryptionConfigurationProperty(studioEncryptionConfiguration))

    /**
     * @param studioName The name of the studio, as included in the URL when accessing it in the
     * Nimble Studio portal. 
     */
    override fun studioName(studioName: String) {
      cdkBuilder.studioName(studioName)
    }

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param userRoleArn The IAM role that studio users assume when logging in to the Nimble Studio
     * portal. 
     */
    override fun userRoleArn(userRoleArn: String) {
      cdkBuilder.userRoleArn(userRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.nimblestudio.CfnStudioProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioProps,
  ) : CdkObject(cdkObject), CfnStudioProps {
    /**
     * The IAM role that studio admins assume when logging in to the Nimble Studio portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-adminrolearn)
     */
    override fun adminRoleArn(): String = unwrap(this).getAdminRoleArn()

    /**
     * A friendly name for the studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-displayname)
     */
    override fun displayName(): String = unwrap(this).getDisplayName()

    /**
     * Configuration of the encryption method that is used for the studio.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioencryptionconfiguration)
     */
    override fun studioEncryptionConfiguration(): Any? =
        unwrap(this).getStudioEncryptionConfiguration()

    /**
     * The name of the studio, as included in the URL when accessing it in the Nimble Studio portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-studioname)
     */
    override fun studioName(): String = unwrap(this).getStudioName()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The IAM role that studio users assume when logging in to the Nimble Studio portal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-nimblestudio-studio.html#cfn-nimblestudio-studio-userrolearn)
     */
    override fun userRoleArn(): String = unwrap(this).getUserRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStudioProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.nimblestudio.CfnStudioProps):
        CfnStudioProps = CdkObjectWrappers.wrap(cdkObject) as? CfnStudioProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStudioProps):
        software.amazon.awscdk.services.nimblestudio.CfnStudioProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.nimblestudio.CfnStudioProps
  }
}
