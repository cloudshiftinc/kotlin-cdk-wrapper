@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ssmguiconnect

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specify new or changed connection recording preferences for your AWS Systems Manager GUI Connect
 * connections.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ssmguiconnect.*;
 * CfnPreferences cfnPreferences = CfnPreferences.Builder.create(this, "MyCfnPreferences")
 * .connectionRecordingPreferences(ConnectionRecordingPreferencesProperty.builder()
 * .kmsKeyArn("kmsKeyArn")
 * .recordingDestinations(RecordingDestinationsProperty.builder()
 * .s3Buckets(List.of(S3BucketProperty.builder()
 * .bucketName("bucketName")
 * .bucketOwner("bucketOwner")
 * .build()))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmguiconnect-preferences.html)
 */
public open class CfnPreferences(
  cdkObject: software.amazon.awscdk.services.ssmguiconnect.CfnPreferences,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.ssmguiconnect.CfnPreferences(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPreferencesProps,
  ) :
      this(software.amazon.awscdk.services.ssmguiconnect.CfnPreferences(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPreferencesProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPreferencesProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPreferencesProps(props)
  )

  /**
   * The primary identifier for the AWS CloudFormation resource.
   */
  public open fun attrAccountId(): String = unwrap(this).getAttrAccountId()

  /**
   * The set of preferences used for recording RDP connections in the requesting AWS account and AWS
   * Region .
   */
  public open fun connectionRecordingPreferences(): Any? =
      unwrap(this).getConnectionRecordingPreferences()

  /**
   * The set of preferences used for recording RDP connections in the requesting AWS account and AWS
   * Region .
   */
  public open fun connectionRecordingPreferences(`value`: IResolvable) {
    unwrap(this).setConnectionRecordingPreferences(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The set of preferences used for recording RDP connections in the requesting AWS account and AWS
   * Region .
   */
  public open fun connectionRecordingPreferences(`value`: ConnectionRecordingPreferencesProperty) {
    unwrap(this).setConnectionRecordingPreferences(`value`.let(ConnectionRecordingPreferencesProperty.Companion::unwrap))
  }

  /**
   * The set of preferences used for recording RDP connections in the requesting AWS account and AWS
   * Region .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2e2c473bcba5c549d1532f765b1c12072450ac8cacb8f3a12d7c5e8ece77e3ce")
  public open
      fun connectionRecordingPreferences(`value`: ConnectionRecordingPreferencesProperty.Builder.() -> Unit):
      Unit = connectionRecordingPreferences(ConnectionRecordingPreferencesProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ssmguiconnect.CfnPreferences].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The set of preferences used for recording RDP connections in the requesting AWS account and
     * AWS Region .
     *
     * This includes details such as which S3 bucket recordings are stored in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmguiconnect-preferences.html#cfn-ssmguiconnect-preferences-connectionrecordingpreferences)
     * @param connectionRecordingPreferences The set of preferences used for recording RDP
     * connections in the requesting AWS account and AWS Region . 
     */
    public fun connectionRecordingPreferences(connectionRecordingPreferences: IResolvable)

    /**
     * The set of preferences used for recording RDP connections in the requesting AWS account and
     * AWS Region .
     *
     * This includes details such as which S3 bucket recordings are stored in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmguiconnect-preferences.html#cfn-ssmguiconnect-preferences-connectionrecordingpreferences)
     * @param connectionRecordingPreferences The set of preferences used for recording RDP
     * connections in the requesting AWS account and AWS Region . 
     */
    public
        fun connectionRecordingPreferences(connectionRecordingPreferences: ConnectionRecordingPreferencesProperty)

    /**
     * The set of preferences used for recording RDP connections in the requesting AWS account and
     * AWS Region .
     *
     * This includes details such as which S3 bucket recordings are stored in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmguiconnect-preferences.html#cfn-ssmguiconnect-preferences-connectionrecordingpreferences)
     * @param connectionRecordingPreferences The set of preferences used for recording RDP
     * connections in the requesting AWS account and AWS Region . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("621a008c5b4e750b4d1ba04364630c1b62315fad37b4b2ca3b024d65eb142539")
    public
        fun connectionRecordingPreferences(connectionRecordingPreferences: ConnectionRecordingPreferencesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.Builder =
        software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.Builder.create(scope, id)

    /**
     * The set of preferences used for recording RDP connections in the requesting AWS account and
     * AWS Region .
     *
     * This includes details such as which S3 bucket recordings are stored in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmguiconnect-preferences.html#cfn-ssmguiconnect-preferences-connectionrecordingpreferences)
     * @param connectionRecordingPreferences The set of preferences used for recording RDP
     * connections in the requesting AWS account and AWS Region . 
     */
    override fun connectionRecordingPreferences(connectionRecordingPreferences: IResolvable) {
      cdkBuilder.connectionRecordingPreferences(connectionRecordingPreferences.let(IResolvable.Companion::unwrap))
    }

    /**
     * The set of preferences used for recording RDP connections in the requesting AWS account and
     * AWS Region .
     *
     * This includes details such as which S3 bucket recordings are stored in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmguiconnect-preferences.html#cfn-ssmguiconnect-preferences-connectionrecordingpreferences)
     * @param connectionRecordingPreferences The set of preferences used for recording RDP
     * connections in the requesting AWS account and AWS Region . 
     */
    override
        fun connectionRecordingPreferences(connectionRecordingPreferences: ConnectionRecordingPreferencesProperty) {
      cdkBuilder.connectionRecordingPreferences(connectionRecordingPreferences.let(ConnectionRecordingPreferencesProperty.Companion::unwrap))
    }

    /**
     * The set of preferences used for recording RDP connections in the requesting AWS account and
     * AWS Region .
     *
     * This includes details such as which S3 bucket recordings are stored in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssmguiconnect-preferences.html#cfn-ssmguiconnect-preferences-connectionrecordingpreferences)
     * @param connectionRecordingPreferences The set of preferences used for recording RDP
     * connections in the requesting AWS account and AWS Region . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("621a008c5b4e750b4d1ba04364630c1b62315fad37b4b2ca3b024d65eb142539")
    override
        fun connectionRecordingPreferences(connectionRecordingPreferences: ConnectionRecordingPreferencesProperty.Builder.() -> Unit):
        Unit =
        connectionRecordingPreferences(ConnectionRecordingPreferencesProperty(connectionRecordingPreferences))

    public fun build(): software.amazon.awscdk.services.ssmguiconnect.CfnPreferences =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPreferences {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPreferences(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ssmguiconnect.CfnPreferences):
        CfnPreferences = CfnPreferences(cdkObject)

    internal fun unwrap(wrapped: CfnPreferences):
        software.amazon.awscdk.services.ssmguiconnect.CfnPreferences = wrapped.cdkObject as
        software.amazon.awscdk.services.ssmguiconnect.CfnPreferences
  }

  /**
   * The set of preferences used for recording RDP connections in the requesting AWS account and AWS
   * Region .
   *
   * This includes details such as which S3 bucket recordings are stored in.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmguiconnect.*;
   * ConnectionRecordingPreferencesProperty connectionRecordingPreferencesProperty =
   * ConnectionRecordingPreferencesProperty.builder()
   * .kmsKeyArn("kmsKeyArn")
   * .recordingDestinations(RecordingDestinationsProperty.builder()
   * .s3Buckets(List.of(S3BucketProperty.builder()
   * .bucketName("bucketName")
   * .bucketOwner("bucketOwner")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-connectionrecordingpreferences.html)
   */
  public interface ConnectionRecordingPreferencesProperty {
    /**
     * The ARN of a AWS KMS key that is used to encrypt data while it is being processed by the
     * service.
     *
     * This key must exist in the same AWS Region as the node you start an RDP connection to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-connectionrecordingpreferences.html#cfn-ssmguiconnect-preferences-connectionrecordingpreferences-kmskeyarn)
     */
    public fun kmsKeyArn(): String

    /**
     * Determines where recordings of RDP connections are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-connectionrecordingpreferences.html#cfn-ssmguiconnect-preferences-connectionrecordingpreferences-recordingdestinations)
     */
    public fun recordingDestinations(): Any

    /**
     * A builder for [ConnectionRecordingPreferencesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyArn The ARN of a AWS KMS key that is used to encrypt data while it is being
       * processed by the service. 
       * This key must exist in the same AWS Region as the node you start an RDP connection to.
       */
      public fun kmsKeyArn(kmsKeyArn: String)

      /**
       * @param recordingDestinations Determines where recordings of RDP connections are stored. 
       */
      public fun recordingDestinations(recordingDestinations: IResolvable)

      /**
       * @param recordingDestinations Determines where recordings of RDP connections are stored. 
       */
      public fun recordingDestinations(recordingDestinations: RecordingDestinationsProperty)

      /**
       * @param recordingDestinations Determines where recordings of RDP connections are stored. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77a25b6453abf11e84cfb2322106b646db5217d5a9053b0eb5d8834c0b8f27e4")
      public
          fun recordingDestinations(recordingDestinations: RecordingDestinationsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.ConnectionRecordingPreferencesProperty.Builder
          =
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.ConnectionRecordingPreferencesProperty.builder()

      /**
       * @param kmsKeyArn The ARN of a AWS KMS key that is used to encrypt data while it is being
       * processed by the service. 
       * This key must exist in the same AWS Region as the node you start an RDP connection to.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      /**
       * @param recordingDestinations Determines where recordings of RDP connections are stored. 
       */
      override fun recordingDestinations(recordingDestinations: IResolvable) {
        cdkBuilder.recordingDestinations(recordingDestinations.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param recordingDestinations Determines where recordings of RDP connections are stored. 
       */
      override fun recordingDestinations(recordingDestinations: RecordingDestinationsProperty) {
        cdkBuilder.recordingDestinations(recordingDestinations.let(RecordingDestinationsProperty.Companion::unwrap))
      }

      /**
       * @param recordingDestinations Determines where recordings of RDP connections are stored. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("77a25b6453abf11e84cfb2322106b646db5217d5a9053b0eb5d8834c0b8f27e4")
      override
          fun recordingDestinations(recordingDestinations: RecordingDestinationsProperty.Builder.() -> Unit):
          Unit = recordingDestinations(RecordingDestinationsProperty(recordingDestinations))

      public fun build():
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.ConnectionRecordingPreferencesProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.ConnectionRecordingPreferencesProperty,
    ) : CdkObject(cdkObject),
        ConnectionRecordingPreferencesProperty {
      /**
       * The ARN of a AWS KMS key that is used to encrypt data while it is being processed by the
       * service.
       *
       * This key must exist in the same AWS Region as the node you start an RDP connection to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-connectionrecordingpreferences.html#cfn-ssmguiconnect-preferences-connectionrecordingpreferences-kmskeyarn)
       */
      override fun kmsKeyArn(): String = unwrap(this).getKmsKeyArn()

      /**
       * Determines where recordings of RDP connections are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-connectionrecordingpreferences.html#cfn-ssmguiconnect-preferences-connectionrecordingpreferences-recordingdestinations)
       */
      override fun recordingDestinations(): Any = unwrap(this).getRecordingDestinations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ConnectionRecordingPreferencesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.ConnectionRecordingPreferencesProperty):
          ConnectionRecordingPreferencesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ConnectionRecordingPreferencesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConnectionRecordingPreferencesProperty):
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.ConnectionRecordingPreferencesProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.ConnectionRecordingPreferencesProperty
    }
  }

  /**
   * Determines where recordings of RDP connections are stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmguiconnect.*;
   * RecordingDestinationsProperty recordingDestinationsProperty =
   * RecordingDestinationsProperty.builder()
   * .s3Buckets(List.of(S3BucketProperty.builder()
   * .bucketName("bucketName")
   * .bucketOwner("bucketOwner")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-recordingdestinations.html)
   */
  public interface RecordingDestinationsProperty {
    /**
     * The S3 bucket where RDP connection recordings are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-recordingdestinations.html#cfn-ssmguiconnect-preferences-recordingdestinations-s3buckets)
     */
    public fun s3Buckets(): Any

    /**
     * A builder for [RecordingDestinationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Buckets The S3 bucket where RDP connection recordings are stored. 
       */
      public fun s3Buckets(s3Buckets: IResolvable)

      /**
       * @param s3Buckets The S3 bucket where RDP connection recordings are stored. 
       */
      public fun s3Buckets(s3Buckets: List<Any>)

      /**
       * @param s3Buckets The S3 bucket where RDP connection recordings are stored. 
       */
      public fun s3Buckets(vararg s3Buckets: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.RecordingDestinationsProperty.Builder
          =
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.RecordingDestinationsProperty.builder()

      /**
       * @param s3Buckets The S3 bucket where RDP connection recordings are stored. 
       */
      override fun s3Buckets(s3Buckets: IResolvable) {
        cdkBuilder.s3Buckets(s3Buckets.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3Buckets The S3 bucket where RDP connection recordings are stored. 
       */
      override fun s3Buckets(s3Buckets: List<Any>) {
        cdkBuilder.s3Buckets(s3Buckets.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param s3Buckets The S3 bucket where RDP connection recordings are stored. 
       */
      override fun s3Buckets(vararg s3Buckets: Any): Unit = s3Buckets(s3Buckets.toList())

      public fun build():
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.RecordingDestinationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.RecordingDestinationsProperty,
    ) : CdkObject(cdkObject),
        RecordingDestinationsProperty {
      /**
       * The S3 bucket where RDP connection recordings are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-recordingdestinations.html#cfn-ssmguiconnect-preferences-recordingdestinations-s3buckets)
       */
      override fun s3Buckets(): Any = unwrap(this).getS3Buckets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordingDestinationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.RecordingDestinationsProperty):
          RecordingDestinationsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          RecordingDestinationsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordingDestinationsProperty):
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.RecordingDestinationsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.RecordingDestinationsProperty
    }
  }

  /**
   * The S3 bucket where RDP connection recordings are stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.ssmguiconnect.*;
   * S3BucketProperty s3BucketProperty = S3BucketProperty.builder()
   * .bucketName("bucketName")
   * .bucketOwner("bucketOwner")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-s3bucket.html)
   */
  public interface S3BucketProperty {
    /**
     * The name of the S3 bucket where RDP connection recordings are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-s3bucket.html#cfn-ssmguiconnect-preferences-s3bucket-bucketname)
     */
    public fun bucketName(): String

    /**
     * The AWS account number that owns the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-s3bucket.html#cfn-ssmguiconnect-preferences-s3bucket-bucketowner)
     */
    public fun bucketOwner(): String

    /**
     * A builder for [S3BucketProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketName The name of the S3 bucket where RDP connection recordings are stored. 
       */
      public fun bucketName(bucketName: String)

      /**
       * @param bucketOwner The AWS account number that owns the S3 bucket. 
       */
      public fun bucketOwner(bucketOwner: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.S3BucketProperty.Builder =
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.S3BucketProperty.builder()

      /**
       * @param bucketName The name of the S3 bucket where RDP connection recordings are stored. 
       */
      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      /**
       * @param bucketOwner The AWS account number that owns the S3 bucket. 
       */
      override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      public fun build():
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.S3BucketProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.S3BucketProperty,
    ) : CdkObject(cdkObject),
        S3BucketProperty {
      /**
       * The name of the S3 bucket where RDP connection recordings are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-s3bucket.html#cfn-ssmguiconnect-preferences-s3bucket-bucketname)
       */
      override fun bucketName(): String = unwrap(this).getBucketName()

      /**
       * The AWS account number that owns the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssmguiconnect-preferences-s3bucket.html#cfn-ssmguiconnect-preferences-s3bucket-bucketowner)
       */
      override fun bucketOwner(): String = unwrap(this).getBucketOwner()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3BucketProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.S3BucketProperty):
          S3BucketProperty = CdkObjectWrappers.wrap(cdkObject) as? S3BucketProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3BucketProperty):
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.S3BucketProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.ssmguiconnect.CfnPreferences.S3BucketProperty
    }
  }
}
