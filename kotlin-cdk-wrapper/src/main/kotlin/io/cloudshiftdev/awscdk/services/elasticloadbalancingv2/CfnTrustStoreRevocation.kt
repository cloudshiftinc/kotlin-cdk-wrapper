@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds the specified revocation contents to the specified trust store.
 *
 * You must specify `TrustStoreArn` .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
 * CfnTrustStoreRevocation cfnTrustStoreRevocation = CfnTrustStoreRevocation.Builder.create(this,
 * "MyCfnTrustStoreRevocation")
 * .revocationContents(List.of(RevocationContentProperty.builder()
 * .revocationType("revocationType")
 * .s3Bucket("s3Bucket")
 * .s3Key("s3Key")
 * .s3ObjectVersion("s3ObjectVersion")
 * .build()))
 * .trustStoreArn("trustStoreArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html)
 */
public open class CfnTrustStoreRevocation internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The revocation ID of the revocation file.
   */
  public open fun attrRevocationId(): Number = unwrap(this).getAttrRevocationId()

  /**
   * Information about the revocation file in the trust store.
   */
  public open fun attrTrustStoreRevocations(): IResolvable =
      unwrap(this).getAttrTrustStoreRevocations().let(IResolvable::wrap)

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The revocation file to add.
   */
  public open fun revocationContents(): Any? = unwrap(this).getRevocationContents()

  /**
   * The revocation file to add.
   */
  public open fun revocationContents(`value`: IResolvable) {
    unwrap(this).setRevocationContents(`value`.let(IResolvable::unwrap))
  }

  /**
   * The revocation file to add.
   */
  public open fun revocationContents(__idx_ac66f0: List<Any>) {
    unwrap(this).setRevocationContents(__idx_ac66f0)
  }

  /**
   * The revocation file to add.
   */
  public open fun revocationContents(vararg __idx_ac66f0: Any): Unit =
      revocationContents(__idx_ac66f0.toList())

  /**
   * The Amazon Resource Name (ARN) of the trust store.
   */
  public open fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

  /**
   * The Amazon Resource Name (ARN) of the trust store.
   */
  public open fun trustStoreArn(`value`: String) {
    unwrap(this).setTrustStoreArn(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The revocation file to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontents)
     * @param revocationContents The revocation file to add. 
     */
    public fun revocationContents(revocationContents: IResolvable)

    /**
     * The revocation file to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontents)
     * @param revocationContents The revocation file to add. 
     */
    public fun revocationContents(revocationContents: List<Any>)

    /**
     * The revocation file to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontents)
     * @param revocationContents The revocation file to add. 
     */
    public fun revocationContents(vararg revocationContents: Any)

    /**
     * The Amazon Resource Name (ARN) of the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorearn)
     * @param trustStoreArn The Amazon Resource Name (ARN) of the trust store. 
     */
    public fun trustStoreArn(trustStoreArn: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.Builder =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.Builder.create(scope,
        id)

    /**
     * The revocation file to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontents)
     * @param revocationContents The revocation file to add. 
     */
    override fun revocationContents(revocationContents: IResolvable) {
      cdkBuilder.revocationContents(revocationContents.let(IResolvable::unwrap))
    }

    /**
     * The revocation file to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontents)
     * @param revocationContents The revocation file to add. 
     */
    override fun revocationContents(revocationContents: List<Any>) {
      cdkBuilder.revocationContents(revocationContents)
    }

    /**
     * The revocation file to add.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontents)
     * @param revocationContents The revocation file to add. 
     */
    override fun revocationContents(vararg revocationContents: Any): Unit =
        revocationContents(revocationContents.toList())

    /**
     * The Amazon Resource Name (ARN) of the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-elasticloadbalancingv2-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorearn)
     * @param trustStoreArn The Amazon Resource Name (ARN) of the trust store. 
     */
    override fun trustStoreArn(trustStoreArn: String) {
      cdkBuilder.trustStoreArn(trustStoreArn)
    }

    public fun build():
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrustStoreRevocation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrustStoreRevocation(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation):
        CfnTrustStoreRevocation = CfnTrustStoreRevocation(cdkObject)

    internal fun unwrap(wrapped: CfnTrustStoreRevocation):
        software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation =
        wrapped.cdkObject
  }

  /**
   * Information about a revocation file.
   *
   * You must specify `S3Bucket` and `S3Key` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
   * RevocationContentProperty revocationContentProperty = RevocationContentProperty.builder()
   * .revocationType("revocationType")
   * .s3Bucket("s3Bucket")
   * .s3Key("s3Key")
   * .s3ObjectVersion("s3ObjectVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-revocationcontent.html)
   */
  public interface RevocationContentProperty {
    /**
     * The type of revocation file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-revocationcontent.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontent-revocationtype)
     */
    public fun revocationType(): String? = unwrap(this).getRevocationType()

    /**
     * The Amazon S3 bucket for the revocation file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-revocationcontent.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontent-s3bucket)
     */
    public fun s3Bucket(): String? = unwrap(this).getS3Bucket()

    /**
     * The Amazon S3 path for the revocation file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-revocationcontent.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontent-s3key)
     */
    public fun s3Key(): String? = unwrap(this).getS3Key()

    /**
     * The Amazon S3 object version of the revocation file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-revocationcontent.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontent-s3objectversion)
     */
    public fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()

    /**
     * A builder for [RevocationContentProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param revocationType The type of revocation file.
       */
      public fun revocationType(revocationType: String)

      /**
       * @param s3Bucket The Amazon S3 bucket for the revocation file.
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3Key The Amazon S3 path for the revocation file.
       */
      public fun s3Key(s3Key: String)

      /**
       * @param s3ObjectVersion The Amazon S3 object version of the revocation file.
       */
      public fun s3ObjectVersion(s3ObjectVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty.builder()

      /**
       * @param revocationType The type of revocation file.
       */
      override fun revocationType(revocationType: String) {
        cdkBuilder.revocationType(revocationType)
      }

      /**
       * @param s3Bucket The Amazon S3 bucket for the revocation file.
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3Key The Amazon S3 path for the revocation file.
       */
      override fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
      }

      /**
       * @param s3ObjectVersion The Amazon S3 object version of the revocation file.
       */
      override fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty,
    ) : CdkObject(cdkObject), RevocationContentProperty {
      /**
       * The type of revocation file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-revocationcontent.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontent-revocationtype)
       */
      override fun revocationType(): String? = unwrap(this).getRevocationType()

      /**
       * The Amazon S3 bucket for the revocation file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-revocationcontent.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontent-s3bucket)
       */
      override fun s3Bucket(): String? = unwrap(this).getS3Bucket()

      /**
       * The Amazon S3 path for the revocation file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-revocationcontent.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontent-s3key)
       */
      override fun s3Key(): String? = unwrap(this).getS3Key()

      /**
       * The Amazon S3 object version of the revocation file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-revocationcontent.html#cfn-elasticloadbalancingv2-truststorerevocation-revocationcontent-s3objectversion)
       */
      override fun s3ObjectVersion(): String? = unwrap(this).getS3ObjectVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RevocationContentProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty):
          RevocationContentProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RevocationContentProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.RevocationContentProperty
    }
  }

  /**
   * Information about a revocation file in use by a trust store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.elasticloadbalancingv2.*;
   * TrustStoreRevocationProperty trustStoreRevocationProperty =
   * TrustStoreRevocationProperty.builder()
   * .numberOfRevokedEntries(123)
   * .revocationId("revocationId")
   * .revocationType("revocationType")
   * .trustStoreArn("trustStoreArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-truststorerevocation.html)
   */
  public interface TrustStoreRevocationProperty {
    /**
     * The number of revoked certificates.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorerevocation-numberofrevokedentries)
     */
    public fun numberOfRevokedEntries(): Number? = unwrap(this).getNumberOfRevokedEntries()

    /**
     * The revocation ID of the revocation file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorerevocation-revocationid)
     */
    public fun revocationId(): String? = unwrap(this).getRevocationId()

    /**
     * The type of revocation file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorerevocation-revocationtype)
     */
    public fun revocationType(): String? = unwrap(this).getRevocationType()

    /**
     * The Amazon Resource Name (ARN) of the trust store.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorerevocation-truststorearn)
     */
    public fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()

    /**
     * A builder for [TrustStoreRevocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param numberOfRevokedEntries The number of revoked certificates.
       */
      public fun numberOfRevokedEntries(numberOfRevokedEntries: Number)

      /**
       * @param revocationId The revocation ID of the revocation file.
       */
      public fun revocationId(revocationId: String)

      /**
       * @param revocationType The type of revocation file.
       */
      public fun revocationType(revocationType: String)

      /**
       * @param trustStoreArn The Amazon Resource Name (ARN) of the trust store.
       */
      public fun trustStoreArn(trustStoreArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty.Builder
          =
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty.builder()

      /**
       * @param numberOfRevokedEntries The number of revoked certificates.
       */
      override fun numberOfRevokedEntries(numberOfRevokedEntries: Number) {
        cdkBuilder.numberOfRevokedEntries(numberOfRevokedEntries)
      }

      /**
       * @param revocationId The revocation ID of the revocation file.
       */
      override fun revocationId(revocationId: String) {
        cdkBuilder.revocationId(revocationId)
      }

      /**
       * @param revocationType The type of revocation file.
       */
      override fun revocationType(revocationType: String) {
        cdkBuilder.revocationType(revocationType)
      }

      /**
       * @param trustStoreArn The Amazon Resource Name (ARN) of the trust store.
       */
      override fun trustStoreArn(trustStoreArn: String) {
        cdkBuilder.trustStoreArn(trustStoreArn)
      }

      public fun build():
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty,
    ) : CdkObject(cdkObject), TrustStoreRevocationProperty {
      /**
       * The number of revoked certificates.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorerevocation-numberofrevokedentries)
       */
      override fun numberOfRevokedEntries(): Number? = unwrap(this).getNumberOfRevokedEntries()

      /**
       * The revocation ID of the revocation file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorerevocation-revocationid)
       */
      override fun revocationId(): String? = unwrap(this).getRevocationId()

      /**
       * The type of revocation file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorerevocation-revocationtype)
       */
      override fun revocationType(): String? = unwrap(this).getRevocationType()

      /**
       * The Amazon Resource Name (ARN) of the trust store.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-truststorerevocation-truststorerevocation.html#cfn-elasticloadbalancingv2-truststorerevocation-truststorerevocation-truststorearn)
       */
      override fun trustStoreArn(): String? = unwrap(this).getTrustStoreArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrustStoreRevocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty):
          TrustStoreRevocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrustStoreRevocationProperty):
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.elasticloadbalancingv2.CfnTrustStoreRevocation.TrustStoreRevocationProperty
    }
  }
}
