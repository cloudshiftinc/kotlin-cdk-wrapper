@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.fsx

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnS3AccessPointAttachment`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.fsx.*;
 * Object policy;
 * CfnS3AccessPointAttachmentProps cfnS3AccessPointAttachmentProps =
 * CfnS3AccessPointAttachmentProps.builder()
 * .name("name")
 * .openZfsConfiguration(S3AccessPointOpenZFSConfigurationProperty.builder()
 * .fileSystemIdentity(OpenZFSFileSystemIdentityProperty.builder()
 * .posixUser(OpenZFSPosixFileSystemUserProperty.builder()
 * .gid(123)
 * .uid(123)
 * // the properties below are optional
 * .secondaryGids(List.of(FileSystemGIDProperty.builder()
 * .gid(123)
 * .build()))
 * .build())
 * .type("type")
 * .build())
 * .volumeId("volumeId")
 * .build())
 * .type("type")
 * // the properties below are optional
 * .s3AccessPoint(S3AccessPointProperty.builder()
 * .alias("alias")
 * .policy(policy)
 * .resourceArn("resourceArn")
 * .vpcConfiguration(S3AccessPointVpcConfigurationProperty.builder()
 * .vpcId("vpcId")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html)
 */
public interface CfnS3AccessPointAttachmentProps {
  /**
   * The name of the S3 access point attachment;
   *
   * also used for the name of the S3 access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-name)
   */
  public fun name(): String

  /**
   * The OpenZFSConfiguration of the S3 access point attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-openzfsconfiguration)
   */
  public fun openZfsConfiguration(): Any

  /**
   * The S3 access point configuration of the S3 access point attachment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-s3accesspoint)
   */
  public fun s3AccessPoint(): Any? = unwrap(this).getS3AccessPoint()

  /**
   * The type of Amazon FSx volume that the S3 access point is attached to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-type)
   */
  public fun type(): String

  /**
   * A builder for [CfnS3AccessPointAttachmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the S3 access point attachment;. 
     * also used for the name of the S3 access point.
     */
    public fun name(name: String)

    /**
     * @param openZfsConfiguration The OpenZFSConfiguration of the S3 access point attachment. 
     */
    public fun openZfsConfiguration(openZfsConfiguration: IResolvable)

    /**
     * @param openZfsConfiguration The OpenZFSConfiguration of the S3 access point attachment. 
     */
    public
        fun openZfsConfiguration(openZfsConfiguration: CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty)

    /**
     * @param openZfsConfiguration The OpenZFSConfiguration of the S3 access point attachment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2075bb87c800787fc2d5e97f923c905f7a24851478d5c7ece62e55dc0b08e38a")
    public
        fun openZfsConfiguration(openZfsConfiguration: CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty.Builder.() -> Unit)

    /**
     * @param s3AccessPoint The S3 access point configuration of the S3 access point attachment.
     */
    public fun s3AccessPoint(s3AccessPoint: IResolvable)

    /**
     * @param s3AccessPoint The S3 access point configuration of the S3 access point attachment.
     */
    public fun s3AccessPoint(s3AccessPoint: CfnS3AccessPointAttachment.S3AccessPointProperty)

    /**
     * @param s3AccessPoint The S3 access point configuration of the S3 access point attachment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d50a2203a3c1823b28c81eb2f25d2ab9eb0adce9c21b5df8906744546d100353")
    public
        fun s3AccessPoint(s3AccessPoint: CfnS3AccessPointAttachment.S3AccessPointProperty.Builder.() -> Unit)

    /**
     * @param type The type of Amazon FSx volume that the S3 access point is attached to. 
     */
    public fun type(type: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachmentProps.Builder =
        software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachmentProps.builder()

    /**
     * @param name The name of the S3 access point attachment;. 
     * also used for the name of the S3 access point.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param openZfsConfiguration The OpenZFSConfiguration of the S3 access point attachment. 
     */
    override fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param openZfsConfiguration The OpenZFSConfiguration of the S3 access point attachment. 
     */
    override
        fun openZfsConfiguration(openZfsConfiguration: CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty) {
      cdkBuilder.openZfsConfiguration(openZfsConfiguration.let(CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty.Companion::unwrap))
    }

    /**
     * @param openZfsConfiguration The OpenZFSConfiguration of the S3 access point attachment. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2075bb87c800787fc2d5e97f923c905f7a24851478d5c7ece62e55dc0b08e38a")
    override
        fun openZfsConfiguration(openZfsConfiguration: CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty.Builder.() -> Unit):
        Unit =
        openZfsConfiguration(CfnS3AccessPointAttachment.S3AccessPointOpenZFSConfigurationProperty(openZfsConfiguration))

    /**
     * @param s3AccessPoint The S3 access point configuration of the S3 access point attachment.
     */
    override fun s3AccessPoint(s3AccessPoint: IResolvable) {
      cdkBuilder.s3AccessPoint(s3AccessPoint.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param s3AccessPoint The S3 access point configuration of the S3 access point attachment.
     */
    override fun s3AccessPoint(s3AccessPoint: CfnS3AccessPointAttachment.S3AccessPointProperty) {
      cdkBuilder.s3AccessPoint(s3AccessPoint.let(CfnS3AccessPointAttachment.S3AccessPointProperty.Companion::unwrap))
    }

    /**
     * @param s3AccessPoint The S3 access point configuration of the S3 access point attachment.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d50a2203a3c1823b28c81eb2f25d2ab9eb0adce9c21b5df8906744546d100353")
    override
        fun s3AccessPoint(s3AccessPoint: CfnS3AccessPointAttachment.S3AccessPointProperty.Builder.() -> Unit):
        Unit = s3AccessPoint(CfnS3AccessPointAttachment.S3AccessPointProperty(s3AccessPoint))

    /**
     * @param type The type of Amazon FSx volume that the S3 access point is attached to. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    public fun build(): software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachmentProps,
  ) : CdkObject(cdkObject),
      CfnS3AccessPointAttachmentProps {
    /**
     * The name of the S3 access point attachment;
     *
     * also used for the name of the S3 access point.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The OpenZFSConfiguration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-openzfsconfiguration)
     */
    override fun openZfsConfiguration(): Any = unwrap(this).getOpenZfsConfiguration()

    /**
     * The S3 access point configuration of the S3 access point attachment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-s3accesspoint)
     */
    override fun s3AccessPoint(): Any? = unwrap(this).getS3AccessPoint()

    /**
     * The type of Amazon FSx volume that the S3 access point is attached to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-fsx-s3accesspointattachment.html#cfn-fsx-s3accesspointattachment-type)
     */
    override fun type(): String = unwrap(this).getType()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnS3AccessPointAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachmentProps):
        CfnS3AccessPointAttachmentProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnS3AccessPointAttachmentProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnS3AccessPointAttachmentProps):
        software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.fsx.CfnS3AccessPointAttachmentProps
  }
}
