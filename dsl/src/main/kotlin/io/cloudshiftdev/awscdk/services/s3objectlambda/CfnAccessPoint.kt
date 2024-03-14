package io.cloudshiftdev.awscdk.services.s3objectlambda

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccessPoint internal constructor(
  private val cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrAlias(): IResolvable = unwrap(this).getAttrAlias().let(IResolvable::wrap)

  public open fun attrAliasStatus(): String = unwrap(this).getAttrAliasStatus()

  public open fun attrAliasValue(): String = unwrap(this).getAttrAliasValue()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreationDate(): String = unwrap(this).getAttrCreationDate()

  public open fun attrPolicyStatus(): IResolvable =
      unwrap(this).getAttrPolicyStatus().let(IResolvable::wrap)

  public open fun attrPolicyStatusIsPublic(): IResolvable =
      unwrap(this).getAttrPolicyStatusIsPublic().let(IResolvable::wrap)

  public open fun attrPublicAccessBlockConfiguration(): IResolvable =
      unwrap(this).getAttrPublicAccessBlockConfiguration().let(IResolvable::wrap)

  public open fun attrPublicAccessBlockConfigurationBlockPublicAcls(): IResolvable =
      unwrap(this).getAttrPublicAccessBlockConfigurationBlockPublicAcls().let(IResolvable::wrap)

  public open fun attrPublicAccessBlockConfigurationBlockPublicPolicy(): IResolvable =
      unwrap(this).getAttrPublicAccessBlockConfigurationBlockPublicPolicy().let(IResolvable::wrap)

  public open fun attrPublicAccessBlockConfigurationIgnorePublicAcls(): IResolvable =
      unwrap(this).getAttrPublicAccessBlockConfigurationIgnorePublicAcls().let(IResolvable::wrap)

  public open fun attrPublicAccessBlockConfigurationRestrictPublicBuckets(): IResolvable =
      unwrap(this).getAttrPublicAccessBlockConfigurationRestrictPublicBuckets().let(IResolvable::wrap)

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun objectLambdaConfiguration(): Any = unwrap(this).getObjectLambdaConfiguration()

  public open fun objectLambdaConfiguration(`value`: IResolvable) {
    unwrap(this).setObjectLambdaConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun objectLambdaConfiguration(`value`: ObjectLambdaConfigurationProperty) {
    unwrap(this).setObjectLambdaConfiguration(`value`.let(ObjectLambdaConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e2fc78fc0b4db42c7380110f3c8f27370f1247661726b71bd1d721bb448d7aca")
  public open
      fun objectLambdaConfiguration(`value`: ObjectLambdaConfigurationProperty.Builder.() -> Unit):
      Unit = objectLambdaConfiguration(ObjectLambdaConfigurationProperty(`value`))

  public interface Builder {
    public fun name(name: String)

    public fun objectLambdaConfiguration(objectLambdaConfiguration: IResolvable)

    public
        fun objectLambdaConfiguration(objectLambdaConfiguration: ObjectLambdaConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70ea7a604b02851fdb8d2a38172c4fae60064cab75cb03121fa2f05f1bfd6daf")
    public
        fun objectLambdaConfiguration(objectLambdaConfiguration: ObjectLambdaConfigurationProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.Builder =
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.Builder.create(scope, id)

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun objectLambdaConfiguration(objectLambdaConfiguration: IResolvable) {
      cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration.let(IResolvable::unwrap))
    }

    override
        fun objectLambdaConfiguration(objectLambdaConfiguration: ObjectLambdaConfigurationProperty) {
      cdkBuilder.objectLambdaConfiguration(objectLambdaConfiguration.let(ObjectLambdaConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("70ea7a604b02851fdb8d2a38172c4fae60064cab75cb03121fa2f05f1bfd6daf")
    override
        fun objectLambdaConfiguration(objectLambdaConfiguration: ObjectLambdaConfigurationProperty.Builder.() -> Unit):
        Unit =
        objectLambdaConfiguration(ObjectLambdaConfigurationProperty(objectLambdaConfiguration))

    public fun build(): software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint):
        CfnAccessPoint = CfnAccessPoint(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPoint):
        software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint = wrapped.cdkObject
  }

  public interface ContentTransformationProperty {
    public fun awsLambda(): Any

    public interface Builder {
      public fun awsLambda(awsLambda: IResolvable)

      public fun awsLambda(awsLambda: AwsLambdaProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9be69232cc9fe2a47abed902c83a6e2e7141bcc7c89a6b07fb166e08b6896776")
      public fun awsLambda(awsLambda: AwsLambdaProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty.Builder
          =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty.builder()

      override fun awsLambda(awsLambda: IResolvable) {
        cdkBuilder.awsLambda(awsLambda.let(IResolvable::unwrap))
      }

      override fun awsLambda(awsLambda: AwsLambdaProperty) {
        cdkBuilder.awsLambda(awsLambda.let(AwsLambdaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9be69232cc9fe2a47abed902c83a6e2e7141bcc7c89a6b07fb166e08b6896776")
      override fun awsLambda(awsLambda: AwsLambdaProperty.Builder.() -> Unit): Unit =
          awsLambda(AwsLambdaProperty(awsLambda))

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty,
    ) : ContentTransformationProperty {
      override fun awsLambda(): Any = unwrap(this).getAwsLambda()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ContentTransformationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty):
          ContentTransformationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContentTransformationProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ContentTransformationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface PolicyStatusProperty {
    public fun isPublic(): Any? = unwrap(this).getIsPublic()

    public interface Builder {
      public fun isPublic(isPublic: Boolean)

      public fun isPublic(isPublic: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty.Builder
          =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty.builder()

      override fun isPublic(isPublic: Boolean) {
        cdkBuilder.isPublic(isPublic)
      }

      override fun isPublic(isPublic: IResolvable) {
        cdkBuilder.isPublic(isPublic.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty,
    ) : PolicyStatusProperty {
      override fun isPublic(): Any? = unwrap(this).getIsPublic()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PolicyStatusProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty):
          PolicyStatusProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PolicyStatusProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PolicyStatusProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AwsLambdaProperty {
    public fun functionArn(): String

    public fun functionPayload(): String? = unwrap(this).getFunctionPayload()

    public interface Builder {
      public fun functionArn(functionArn: String)

      public fun functionPayload(functionPayload: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty.Builder =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty.builder()

      override fun functionArn(functionArn: String) {
        cdkBuilder.functionArn(functionArn)
      }

      override fun functionPayload(functionPayload: String) {
        cdkBuilder.functionPayload(functionPayload)
      }

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty,
    ) : AwsLambdaProperty {
      override fun functionArn(): String = unwrap(this).getFunctionArn()

      override fun functionPayload(): String? = unwrap(this).getFunctionPayload()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AwsLambdaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty):
          AwsLambdaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AwsLambdaProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AwsLambdaProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface PublicAccessBlockConfigurationProperty {
    public fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

    public fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

    public fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

    public fun restrictPublicBuckets(): Any? = unwrap(this).getRestrictPublicBuckets()

    public interface Builder {
      public fun blockPublicAcls(blockPublicAcls: Boolean)

      public fun blockPublicAcls(blockPublicAcls: IResolvable)

      public fun blockPublicPolicy(blockPublicPolicy: Boolean)

      public fun blockPublicPolicy(blockPublicPolicy: IResolvable)

      public fun ignorePublicAcls(ignorePublicAcls: Boolean)

      public fun ignorePublicAcls(ignorePublicAcls: IResolvable)

      public fun restrictPublicBuckets(restrictPublicBuckets: Boolean)

      public fun restrictPublicBuckets(restrictPublicBuckets: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty.builder()

      override fun blockPublicAcls(blockPublicAcls: Boolean) {
        cdkBuilder.blockPublicAcls(blockPublicAcls)
      }

      override fun blockPublicAcls(blockPublicAcls: IResolvable) {
        cdkBuilder.blockPublicAcls(blockPublicAcls.let(IResolvable::unwrap))
      }

      override fun blockPublicPolicy(blockPublicPolicy: Boolean) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy)
      }

      override fun blockPublicPolicy(blockPublicPolicy: IResolvable) {
        cdkBuilder.blockPublicPolicy(blockPublicPolicy.let(IResolvable::unwrap))
      }

      override fun ignorePublicAcls(ignorePublicAcls: Boolean) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls)
      }

      override fun ignorePublicAcls(ignorePublicAcls: IResolvable) {
        cdkBuilder.ignorePublicAcls(ignorePublicAcls.let(IResolvable::unwrap))
      }

      override fun restrictPublicBuckets(restrictPublicBuckets: Boolean) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets)
      }

      override fun restrictPublicBuckets(restrictPublicBuckets: IResolvable) {
        cdkBuilder.restrictPublicBuckets(restrictPublicBuckets.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty,
    ) : PublicAccessBlockConfigurationProperty {
      override fun blockPublicAcls(): Any? = unwrap(this).getBlockPublicAcls()

      override fun blockPublicPolicy(): Any? = unwrap(this).getBlockPublicPolicy()

      override fun ignorePublicAcls(): Any? = unwrap(this).getIgnorePublicAcls()

      override fun restrictPublicBuckets(): Any? = unwrap(this).getRestrictPublicBuckets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          PublicAccessBlockConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty):
          PublicAccessBlockConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PublicAccessBlockConfigurationProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.PublicAccessBlockConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TransformationConfigurationProperty {
    public fun actions(): List<String>

    public fun contentTransformation(): Any

    public interface Builder {
      public fun actions(actions: List<String>)

      public fun contentTransformation(contentTransformation: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty.builder()

      override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      override fun contentTransformation(contentTransformation: Any) {
        cdkBuilder.contentTransformation(contentTransformation)
      }

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty,
    ) : TransformationConfigurationProperty {
      override fun actions(): List<String> = unwrap(this).getActions() ?: emptyList()

      override fun contentTransformation(): Any = unwrap(this).getContentTransformation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TransformationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty):
          TransformationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransformationConfigurationProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.TransformationConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ObjectLambdaConfigurationProperty {
    public fun allowedFeatures(): List<String> = unwrap(this).getAllowedFeatures() ?: emptyList()

    public fun cloudWatchMetricsEnabled(): Any? = unwrap(this).getCloudWatchMetricsEnabled()

    public fun supportingAccessPoint(): String

    public fun transformationConfigurations(): Any

    public interface Builder {
      public fun allowedFeatures(allowedFeatures: List<String>)

      public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean)

      public fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable)

      public fun supportingAccessPoint(supportingAccessPoint: String)

      public fun transformationConfigurations(transformationConfigurations: IResolvable)

      public fun transformationConfigurations(transformationConfigurations: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty.builder()

      override fun allowedFeatures(allowedFeatures: List<String>) {
        cdkBuilder.allowedFeatures(allowedFeatures)
      }

      override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: Boolean) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled)
      }

      override fun cloudWatchMetricsEnabled(cloudWatchMetricsEnabled: IResolvable) {
        cdkBuilder.cloudWatchMetricsEnabled(cloudWatchMetricsEnabled.let(IResolvable::unwrap))
      }

      override fun supportingAccessPoint(supportingAccessPoint: String) {
        cdkBuilder.supportingAccessPoint(supportingAccessPoint)
      }

      override fun transformationConfigurations(transformationConfigurations: IResolvable) {
        cdkBuilder.transformationConfigurations(transformationConfigurations.let(IResolvable::unwrap))
      }

      override fun transformationConfigurations(transformationConfigurations: List<Any>) {
        cdkBuilder.transformationConfigurations(transformationConfigurations)
      }

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty,
    ) : ObjectLambdaConfigurationProperty {
      override fun allowedFeatures(): List<String> = unwrap(this).getAllowedFeatures() ?:
          emptyList()

      override fun cloudWatchMetricsEnabled(): Any? = unwrap(this).getCloudWatchMetricsEnabled()

      override fun supportingAccessPoint(): String = unwrap(this).getSupportingAccessPoint()

      override fun transformationConfigurations(): Any =
          unwrap(this).getTransformationConfigurations()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ObjectLambdaConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty):
          ObjectLambdaConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ObjectLambdaConfigurationProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.ObjectLambdaConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AliasProperty {
    public fun status(): String? = unwrap(this).getStatus()

    public fun `value`(): String

    public interface Builder {
      public fun status(status: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty.Builder =
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty.builder()

      override fun status(status: String) {
        cdkBuilder.status(status)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty,
    ) : AliasProperty {
      override fun status(): String? = unwrap(this).getStatus()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AliasProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty):
          AliasProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AliasProperty):
          software.amazon.awscdk.services.s3objectlambda.CfnAccessPoint.AliasProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
