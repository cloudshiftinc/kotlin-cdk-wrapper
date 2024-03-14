package io.cloudshiftdev.awscdk.services.evidently

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnProject internal constructor(
  private val cdkObject: software.amazon.awscdk.services.evidently.CfnProject,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun appConfigResource(): Any? = unwrap(this).getAppConfigResource()

  public open fun appConfigResource(`value`: IResolvable) {
    unwrap(this).setAppConfigResource(`value`.let(IResolvable::unwrap))
  }

  public open fun appConfigResource(`value`: AppConfigResourceObjectProperty) {
    unwrap(this).setAppConfigResource(`value`.let(AppConfigResourceObjectProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("939aff7cb926d7a8e3b70eda82d680762c744a238e28b2e97a85325d5afc36f7")
  public open fun appConfigResource(`value`: AppConfigResourceObjectProperty.Builder.() -> Unit):
      Unit = appConfigResource(AppConfigResourceObjectProperty(`value`))

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun dataDelivery(): Any? = unwrap(this).getDataDelivery()

  public open fun dataDelivery(`value`: IResolvable) {
    unwrap(this).setDataDelivery(`value`.let(IResolvable::unwrap))
  }

  public open fun dataDelivery(`value`: DataDeliveryObjectProperty) {
    unwrap(this).setDataDelivery(`value`.let(DataDeliveryObjectProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5e05b7b462e1fe8799fe661239a36561bf2b3d0d6e6348b15acf7b43414e332f")
  public open fun dataDelivery(`value`: DataDeliveryObjectProperty.Builder.() -> Unit): Unit =
      dataDelivery(DataDeliveryObjectProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun appConfigResource(appConfigResource: IResolvable)

    public fun appConfigResource(appConfigResource: AppConfigResourceObjectProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c58780625dbccb6ada80e2fdecd5fa7458ecfa7e3b72b67e9e56897231e88c8")
    public
        fun appConfigResource(appConfigResource: AppConfigResourceObjectProperty.Builder.() -> Unit)

    public fun dataDelivery(dataDelivery: IResolvable)

    public fun dataDelivery(dataDelivery: DataDeliveryObjectProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb85785ee2aedddaff00d956283467969b245ea062d5a0993529891592acec7a")
    public fun dataDelivery(dataDelivery: DataDeliveryObjectProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.evidently.CfnProject.Builder =
        software.amazon.awscdk.services.evidently.CfnProject.Builder.create(scope, id)

    override fun appConfigResource(appConfigResource: IResolvable) {
      cdkBuilder.appConfigResource(appConfigResource.let(IResolvable::unwrap))
    }

    override fun appConfigResource(appConfigResource: AppConfigResourceObjectProperty) {
      cdkBuilder.appConfigResource(appConfigResource.let(AppConfigResourceObjectProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5c58780625dbccb6ada80e2fdecd5fa7458ecfa7e3b72b67e9e56897231e88c8")
    override
        fun appConfigResource(appConfigResource: AppConfigResourceObjectProperty.Builder.() -> Unit):
        Unit = appConfigResource(AppConfigResourceObjectProperty(appConfigResource))

    override fun dataDelivery(dataDelivery: IResolvable) {
      cdkBuilder.dataDelivery(dataDelivery.let(IResolvable::unwrap))
    }

    override fun dataDelivery(dataDelivery: DataDeliveryObjectProperty) {
      cdkBuilder.dataDelivery(dataDelivery.let(DataDeliveryObjectProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cb85785ee2aedddaff00d956283467969b245ea062d5a0993529891592acec7a")
    override fun dataDelivery(dataDelivery: DataDeliveryObjectProperty.Builder.() -> Unit): Unit =
        dataDelivery(DataDeliveryObjectProperty(dataDelivery))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.evidently.CfnProject = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnProject {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnProject(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnProject): CfnProject =
        CfnProject(cdkObject)

    internal fun unwrap(wrapped: CfnProject): software.amazon.awscdk.services.evidently.CfnProject =
        wrapped.cdkObject
  }

  public interface AppConfigResourceObjectProperty {
    public fun applicationId(): String

    public fun environmentId(): String

    public interface Builder {
      public fun applicationId(applicationId: String)

      public fun environmentId(environmentId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnProject.AppConfigResourceObjectProperty.Builder
          =
          software.amazon.awscdk.services.evidently.CfnProject.AppConfigResourceObjectProperty.builder()

      override fun applicationId(applicationId: String) {
        cdkBuilder.applicationId(applicationId)
      }

      override fun environmentId(environmentId: String) {
        cdkBuilder.environmentId(environmentId)
      }

      public fun build():
          software.amazon.awscdk.services.evidently.CfnProject.AppConfigResourceObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnProject.AppConfigResourceObjectProperty,
    ) : AppConfigResourceObjectProperty {
      override fun applicationId(): String = unwrap(this).getApplicationId()

      override fun environmentId(): String = unwrap(this).getEnvironmentId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AppConfigResourceObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnProject.AppConfigResourceObjectProperty):
          AppConfigResourceObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AppConfigResourceObjectProperty):
          software.amazon.awscdk.services.evidently.CfnProject.AppConfigResourceObjectProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataDeliveryObjectProperty {
    public fun logGroup(): String? = unwrap(this).getLogGroup()

    public fun s3(): Any? = unwrap(this).getS3()

    public interface Builder {
      public fun logGroup(logGroup: String)

      public fun s3(s3: IResolvable)

      public fun s3(s3: S3DestinationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16c6cc3d94b00ed1f82f8c65caa3cf1eaafd4892d08efd06b911c8f71164cda9")
      public fun s3(s3: S3DestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnProject.DataDeliveryObjectProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnProject.DataDeliveryObjectProperty.builder()

      override fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
      }

      override fun s3(s3: IResolvable) {
        cdkBuilder.s3(s3.let(IResolvable::unwrap))
      }

      override fun s3(s3: S3DestinationProperty) {
        cdkBuilder.s3(s3.let(S3DestinationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16c6cc3d94b00ed1f82f8c65caa3cf1eaafd4892d08efd06b911c8f71164cda9")
      override fun s3(s3: S3DestinationProperty.Builder.() -> Unit): Unit =
          s3(S3DestinationProperty(s3))

      public fun build():
          software.amazon.awscdk.services.evidently.CfnProject.DataDeliveryObjectProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnProject.DataDeliveryObjectProperty,
    ) : DataDeliveryObjectProperty {
      override fun logGroup(): String? = unwrap(this).getLogGroup()

      override fun s3(): Any? = unwrap(this).getS3()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataDeliveryObjectProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnProject.DataDeliveryObjectProperty):
          DataDeliveryObjectProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataDeliveryObjectProperty):
          software.amazon.awscdk.services.evidently.CfnProject.DataDeliveryObjectProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface S3DestinationProperty {
    public fun bucketName(): String

    public fun prefix(): String? = unwrap(this).getPrefix()

    public interface Builder {
      public fun bucketName(bucketName: String)

      public fun prefix(prefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.evidently.CfnProject.S3DestinationProperty.Builder =
          software.amazon.awscdk.services.evidently.CfnProject.S3DestinationProperty.builder()

      override fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
      }

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      public fun build(): software.amazon.awscdk.services.evidently.CfnProject.S3DestinationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.evidently.CfnProject.S3DestinationProperty,
    ) : S3DestinationProperty {
      override fun bucketName(): String = unwrap(this).getBucketName()

      override fun prefix(): String? = unwrap(this).getPrefix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.evidently.CfnProject.S3DestinationProperty):
          S3DestinationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationProperty):
          software.amazon.awscdk.services.evidently.CfnProject.S3DestinationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
