@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.voiceid

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
 * Properties for defining a `CfnDomain`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.voiceid.*;
 * CfnDomainProps cfnDomainProps = CfnDomainProps.builder()
 * .name("name")
 * .serverSideEncryptionConfiguration(ServerSideEncryptionConfigurationProperty.builder()
 * .kmsKeyId("kmsKeyId")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html)
 */
public interface CfnDomainProps {
  /**
   * The description of the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name for the domain.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-name)
   */
  public fun name(): String

  /**
   * The server-side encryption configuration containing the KMS key identifier you want Voice ID to
   * use to encrypt your data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-serversideencryptionconfiguration)
   */
  public fun serverSideEncryptionConfiguration(): Any

  /**
   * The tags used to organize, track, or control access for this resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDomainProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the domain.
     */
    public fun description(description: String)

    /**
     * @param name The name for the domain. 
     */
    public fun name(name: String)

    /**
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     * the KMS key identifier you want Voice ID to use to encrypt your data. 
     */
    public fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable)

    /**
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     * the KMS key identifier you want Voice ID to use to encrypt your data. 
     */
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnDomain.ServerSideEncryptionConfigurationProperty)

    /**
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     * the KMS key identifier you want Voice ID to use to encrypt your data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7997c3395228bd245b18507ff33dae4d7fac9b9a2d7330c51c61a4666e524369")
    public
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnDomain.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.voiceid.CfnDomainProps.Builder =
        software.amazon.awscdk.services.voiceid.CfnDomainProps.builder()

    /**
     * @param description The description of the domain.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param name The name for the domain. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     * the KMS key identifier you want Voice ID to use to encrypt your data. 
     */
    override fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: IResolvable) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     * the KMS key identifier you want Voice ID to use to encrypt your data. 
     */
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnDomain.ServerSideEncryptionConfigurationProperty) {
      cdkBuilder.serverSideEncryptionConfiguration(serverSideEncryptionConfiguration.let(CfnDomain.ServerSideEncryptionConfigurationProperty::unwrap))
    }

    /**
     * @param serverSideEncryptionConfiguration The server-side encryption configuration containing
     * the KMS key identifier you want Voice ID to use to encrypt your data. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7997c3395228bd245b18507ff33dae4d7fac9b9a2d7330c51c61a4666e524369")
    override
        fun serverSideEncryptionConfiguration(serverSideEncryptionConfiguration: CfnDomain.ServerSideEncryptionConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverSideEncryptionConfiguration(CfnDomain.ServerSideEncryptionConfigurationProperty(serverSideEncryptionConfiguration))

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The tags used to organize, track, or control access for this resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.voiceid.CfnDomainProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.voiceid.CfnDomainProps,
  ) : CdkObject(cdkObject), CfnDomainProps {
    /**
     * The description of the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name for the domain.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The server-side encryption configuration containing the KMS key identifier you want Voice ID
     * to use to encrypt your data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-serversideencryptionconfiguration)
     */
    override fun serverSideEncryptionConfiguration(): Any =
        unwrap(this).getServerSideEncryptionConfiguration()

    /**
     * The tags used to organize, track, or control access for this resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-voiceid-domain.html#cfn-voiceid-domain-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDomainProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.voiceid.CfnDomainProps):
        CfnDomainProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDomainProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDomainProps):
        software.amazon.awscdk.services.voiceid.CfnDomainProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.voiceid.CfnDomainProps
  }
}
