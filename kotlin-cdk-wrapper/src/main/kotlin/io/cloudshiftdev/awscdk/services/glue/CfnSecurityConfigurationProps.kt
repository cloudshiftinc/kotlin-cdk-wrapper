@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnSecurityConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * CfnSecurityConfigurationProps cfnSecurityConfigurationProps =
 * CfnSecurityConfigurationProps.builder()
 * .encryptionConfiguration(EncryptionConfigurationProperty.builder()
 * .cloudWatchEncryption(CloudWatchEncryptionProperty.builder()
 * .cloudWatchEncryptionMode("cloudWatchEncryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .jobBookmarksEncryption(JobBookmarksEncryptionProperty.builder()
 * .jobBookmarksEncryptionMode("jobBookmarksEncryptionMode")
 * .kmsKeyArn("kmsKeyArn")
 * .build())
 * .s3Encryptions(List.of(S3EncryptionProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .s3EncryptionMode("s3EncryptionMode")
 * .build()))
 * .build())
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html)
 */
public interface CfnSecurityConfigurationProps {
  /**
   * The encryption configuration associated with this security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration)
   */
  public fun encryptionConfiguration(): Any

  /**
   * The name of the security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-name)
   */
  public fun name(): String

  /**
   * A builder for [CfnSecurityConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param encryptionConfiguration The encryption configuration associated with this security
     * configuration. 
     */
    public fun encryptionConfiguration(encryptionConfiguration: IResolvable)

    /**
     * @param encryptionConfiguration The encryption configuration associated with this security
     * configuration. 
     */
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty)

    /**
     * @param encryptionConfiguration The encryption configuration associated with this security
     * configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97bb08deaaa0685773d8142f895b1df0b51953bba1e759a383093230b059c37a")
    public
        fun encryptionConfiguration(encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param name The name of the security configuration. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps.Builder =
        software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps.builder()

    /**
     * @param encryptionConfiguration The encryption configuration associated with this security
     * configuration. 
     */
    override fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param encryptionConfiguration The encryption configuration associated with this security
     * configuration. 
     */
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty) {
      cdkBuilder.encryptionConfiguration(encryptionConfiguration.let(CfnSecurityConfiguration.EncryptionConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param encryptionConfiguration The encryption configuration associated with this security
     * configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("97bb08deaaa0685773d8142f895b1df0b51953bba1e759a383093230b059c37a")
    override
        fun encryptionConfiguration(encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        encryptionConfiguration(CfnSecurityConfiguration.EncryptionConfigurationProperty(encryptionConfiguration))

    /**
     * @param name The name of the security configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps,
  ) : CdkObject(cdkObject), CfnSecurityConfigurationProps {
    /**
     * The encryption configuration associated with this security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration)
     */
    override fun encryptionConfiguration(): Any = unwrap(this).getEncryptionConfiguration()

    /**
     * The name of the security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-name)
     */
    override fun name(): String = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps):
        CfnSecurityConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnSecurityConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityConfigurationProps):
        software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.glue.CfnSecurityConfigurationProps
  }
}
