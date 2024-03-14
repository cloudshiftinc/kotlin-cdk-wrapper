package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnJob internal constructor(
  private val cdkObject: software.amazon.awscdk.services.databrew.CfnJob,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun dataCatalogOutputs(): Any? = unwrap(this).getDataCatalogOutputs()

  public open fun dataCatalogOutputs(`value`: IResolvable) {
    unwrap(this).setDataCatalogOutputs(`value`.let(IResolvable::unwrap))
  }

  public open fun dataCatalogOutputs(__idx_ac66f0: List<Any>) {
    unwrap(this).setDataCatalogOutputs(__idx_ac66f0)
  }

  public open fun databaseOutputs(): Any? = unwrap(this).getDatabaseOutputs()

  public open fun databaseOutputs(`value`: IResolvable) {
    unwrap(this).setDatabaseOutputs(`value`.let(IResolvable::unwrap))
  }

  public open fun databaseOutputs(__idx_ac66f0: List<Any>) {
    unwrap(this).setDatabaseOutputs(__idx_ac66f0)
  }

  public open fun datasetName(): String? = unwrap(this).getDatasetName()

  public open fun datasetName(`value`: String) {
    unwrap(this).setDatasetName(`value`)
  }

  public open fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  public open fun encryptionKeyArn(`value`: String) {
    unwrap(this).setEncryptionKeyArn(`value`)
  }

  public open fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

  public open fun encryptionMode(`value`: String) {
    unwrap(this).setEncryptionMode(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun jobSample(): Any? = unwrap(this).getJobSample()

  public open fun jobSample(`value`: IResolvable) {
    unwrap(this).setJobSample(`value`.let(IResolvable::unwrap))
  }

  public open fun jobSample(`value`: JobSampleProperty) {
    unwrap(this).setJobSample(`value`.let(JobSampleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("709c321b978ca824edfd05368ce1be494c5ad3e138abd44a4b2121492a1565c6")
  public open fun jobSample(`value`: JobSampleProperty.Builder.() -> Unit): Unit =
      jobSample(JobSampleProperty(`value`))

  public open fun logSubscription(): String? = unwrap(this).getLogSubscription()

  public open fun logSubscription(`value`: String) {
    unwrap(this).setLogSubscription(`value`)
  }

  public open fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  public open fun maxCapacity(`value`: Number) {
    unwrap(this).setMaxCapacity(`value`)
  }

  public open fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  public open fun maxRetries(`value`: Number) {
    unwrap(this).setMaxRetries(`value`)
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun outputLocation(): Any? = unwrap(this).getOutputLocation()

  public open fun outputLocation(`value`: IResolvable) {
    unwrap(this).setOutputLocation(`value`.let(IResolvable::unwrap))
  }

  public open fun outputLocation(`value`: OutputLocationProperty) {
    unwrap(this).setOutputLocation(`value`.let(OutputLocationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("79bb4cffea50a81b2f4e000059042b6539267f49931de1e204da7b4931e680cc")
  public open fun outputLocation(`value`: OutputLocationProperty.Builder.() -> Unit): Unit =
      outputLocation(OutputLocationProperty(`value`))

  public open fun outputs(): Any? = unwrap(this).getOutputs()

  public open fun outputs(`value`: IResolvable) {
    unwrap(this).setOutputs(`value`.let(IResolvable::unwrap))
  }

  public open fun outputs(__idx_ac66f0: List<Any>) {
    unwrap(this).setOutputs(__idx_ac66f0)
  }

  public open fun profileConfiguration(): Any? = unwrap(this).getProfileConfiguration()

  public open fun profileConfiguration(`value`: IResolvable) {
    unwrap(this).setProfileConfiguration(`value`.let(IResolvable::unwrap))
  }

  public open fun profileConfiguration(`value`: ProfileConfigurationProperty) {
    unwrap(this).setProfileConfiguration(`value`.let(ProfileConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("175d76250248180f790b5989458e28f973c3c3331211b21caf847e8137f5731f")
  public open fun profileConfiguration(`value`: ProfileConfigurationProperty.Builder.() -> Unit):
      Unit = profileConfiguration(ProfileConfigurationProperty(`value`))

  public open fun projectName(): String? = unwrap(this).getProjectName()

  public open fun projectName(`value`: String) {
    unwrap(this).setProjectName(`value`)
  }

  public open fun recipe(): Any? = unwrap(this).getRecipe()

  public open fun recipe(`value`: IResolvable) {
    unwrap(this).setRecipe(`value`.let(IResolvable::unwrap))
  }

  public open fun recipe(`value`: RecipeProperty) {
    unwrap(this).setRecipe(`value`.let(RecipeProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bd95691edf1bf0043236ea1aec0e71c5f8b3174be378e43a37db3e4aefa20f37")
  public open fun recipe(`value`: RecipeProperty.Builder.() -> Unit): Unit =
      recipe(RecipeProperty(`value`))

  public open fun roleArn(): String = unwrap(this).getRoleArn()

  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun timeout(): Number? = unwrap(this).getTimeout()

  public open fun timeout(`value`: Number) {
    unwrap(this).setTimeout(`value`)
  }

  public open fun type(): String = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun validationConfigurations(): Any? = unwrap(this).getValidationConfigurations()

  public open fun validationConfigurations(`value`: IResolvable) {
    unwrap(this).setValidationConfigurations(`value`.let(IResolvable::unwrap))
  }

  public open fun validationConfigurations(__idx_ac66f0: List<Any>) {
    unwrap(this).setValidationConfigurations(__idx_ac66f0)
  }

  public interface Builder {
    public fun dataCatalogOutputs(dataCatalogOutputs: IResolvable)

    public fun dataCatalogOutputs(dataCatalogOutputs: List<Any>)

    public fun databaseOutputs(databaseOutputs: IResolvable)

    public fun databaseOutputs(databaseOutputs: List<Any>)

    public fun datasetName(datasetName: String)

    public fun encryptionKeyArn(encryptionKeyArn: String)

    public fun encryptionMode(encryptionMode: String)

    public fun jobSample(jobSample: IResolvable)

    public fun jobSample(jobSample: JobSampleProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b549f28bb0c6235cf13067784fe0d1308de17069cff35e16d9b73d0d78498494")
    public fun jobSample(jobSample: JobSampleProperty.Builder.() -> Unit)

    public fun logSubscription(logSubscription: String)

    public fun maxCapacity(maxCapacity: Number)

    public fun maxRetries(maxRetries: Number)

    public fun name(name: String)

    public fun outputLocation(outputLocation: IResolvable)

    public fun outputLocation(outputLocation: OutputLocationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7075009e7896fa2dac2cb2a0801bb0767f212db5c58846c9c3602666778667af")
    public fun outputLocation(outputLocation: OutputLocationProperty.Builder.() -> Unit)

    public fun outputs(outputs: IResolvable)

    public fun outputs(outputs: List<Any>)

    public fun profileConfiguration(profileConfiguration: IResolvable)

    public fun profileConfiguration(profileConfiguration: ProfileConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b51a4b5e47d6827520d89764cd2c50826dc27eb6c70d83a7c6ecd3719514a065")
    public
        fun profileConfiguration(profileConfiguration: ProfileConfigurationProperty.Builder.() -> Unit)

    public fun projectName(projectName: String)

    public fun recipe(recipe: IResolvable)

    public fun recipe(recipe: RecipeProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0be0d2ffef1642982d7e29c724383ad3e41980a32dd097444e1c1b7186e338fb")
    public fun recipe(recipe: RecipeProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun timeout(timeout: Number)

    public fun type(type: String)

    public fun validationConfigurations(validationConfigurations: IResolvable)

    public fun validationConfigurations(validationConfigurations: List<Any>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnJob.Builder =
        software.amazon.awscdk.services.databrew.CfnJob.Builder.create(scope, id)

    override fun dataCatalogOutputs(dataCatalogOutputs: IResolvable) {
      cdkBuilder.dataCatalogOutputs(dataCatalogOutputs.let(IResolvable::unwrap))
    }

    override fun dataCatalogOutputs(dataCatalogOutputs: List<Any>) {
      cdkBuilder.dataCatalogOutputs(dataCatalogOutputs)
    }

    override fun databaseOutputs(databaseOutputs: IResolvable) {
      cdkBuilder.databaseOutputs(databaseOutputs.let(IResolvable::unwrap))
    }

    override fun databaseOutputs(databaseOutputs: List<Any>) {
      cdkBuilder.databaseOutputs(databaseOutputs)
    }

    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    override fun encryptionMode(encryptionMode: String) {
      cdkBuilder.encryptionMode(encryptionMode)
    }

    override fun jobSample(jobSample: IResolvable) {
      cdkBuilder.jobSample(jobSample.let(IResolvable::unwrap))
    }

    override fun jobSample(jobSample: JobSampleProperty) {
      cdkBuilder.jobSample(jobSample.let(JobSampleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b549f28bb0c6235cf13067784fe0d1308de17069cff35e16d9b73d0d78498494")
    override fun jobSample(jobSample: JobSampleProperty.Builder.() -> Unit): Unit =
        jobSample(JobSampleProperty(jobSample))

    override fun logSubscription(logSubscription: String) {
      cdkBuilder.logSubscription(logSubscription)
    }

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outputLocation(outputLocation: IResolvable) {
      cdkBuilder.outputLocation(outputLocation.let(IResolvable::unwrap))
    }

    override fun outputLocation(outputLocation: OutputLocationProperty) {
      cdkBuilder.outputLocation(outputLocation.let(OutputLocationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7075009e7896fa2dac2cb2a0801bb0767f212db5c58846c9c3602666778667af")
    override fun outputLocation(outputLocation: OutputLocationProperty.Builder.() -> Unit): Unit =
        outputLocation(OutputLocationProperty(outputLocation))

    override fun outputs(outputs: IResolvable) {
      cdkBuilder.outputs(outputs.let(IResolvable::unwrap))
    }

    override fun outputs(outputs: List<Any>) {
      cdkBuilder.outputs(outputs)
    }

    override fun profileConfiguration(profileConfiguration: IResolvable) {
      cdkBuilder.profileConfiguration(profileConfiguration.let(IResolvable::unwrap))
    }

    override fun profileConfiguration(profileConfiguration: ProfileConfigurationProperty) {
      cdkBuilder.profileConfiguration(profileConfiguration.let(ProfileConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b51a4b5e47d6827520d89764cd2c50826dc27eb6c70d83a7c6ecd3719514a065")
    override
        fun profileConfiguration(profileConfiguration: ProfileConfigurationProperty.Builder.() -> Unit):
        Unit = profileConfiguration(ProfileConfigurationProperty(profileConfiguration))

    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    override fun recipe(recipe: IResolvable) {
      cdkBuilder.recipe(recipe.let(IResolvable::unwrap))
    }

    override fun recipe(recipe: RecipeProperty) {
      cdkBuilder.recipe(recipe.let(RecipeProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0be0d2ffef1642982d7e29c724383ad3e41980a32dd097444e1c1b7186e338fb")
    override fun recipe(recipe: RecipeProperty.Builder.() -> Unit): Unit =
        recipe(RecipeProperty(recipe))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun validationConfigurations(validationConfigurations: IResolvable) {
      cdkBuilder.validationConfigurations(validationConfigurations.let(IResolvable::unwrap))
    }

    override fun validationConfigurations(validationConfigurations: List<Any>) {
      cdkBuilder.validationConfigurations(validationConfigurations)
    }

    public fun build(): software.amazon.awscdk.services.databrew.CfnJob = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnJob {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnJob(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob): CfnJob =
        CfnJob(cdkObject)

    internal fun unwrap(wrapped: CfnJob): software.amazon.awscdk.services.databrew.CfnJob =
        wrapped.cdkObject
  }

  public interface S3LocationProperty {
    public fun bucket(): String

    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    public fun key(): String? = unwrap(this).getKey()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun bucketOwner(bucketOwner: String)

      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty,
    ) : S3LocationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

      override fun key(): String? = unwrap(this).getKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty):
          S3LocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.S3LocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OutputLocationProperty {
    public fun bucket(): String

    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    public fun key(): String? = unwrap(this).getKey()

    public interface Builder {
      public fun bucket(bucket: String)

      public fun bucketOwner(bucketOwner: String)

      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty,
    ) : OutputLocationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

      override fun key(): String? = unwrap(this).getKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty):
          OutputLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputLocationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.OutputLocationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DataCatalogOutputProperty {
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    public fun databaseName(): String

    public fun databaseOptions(): Any? = unwrap(this).getDatabaseOptions()

    public fun overwrite(): Any? = unwrap(this).getOverwrite()

    public fun s3Options(): Any? = unwrap(this).getS3Options()

    public fun tableName(): String

    public interface Builder {
      public fun catalogId(catalogId: String)

      public fun databaseName(databaseName: String)

      public fun databaseOptions(databaseOptions: IResolvable)

      public fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce4395f18fa301583c04a5e808f9abda747b3e0e7509e74a92caa05f01ac9e62")
      public
          fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty.Builder.() -> Unit)

      public fun overwrite(overwrite: Boolean)

      public fun overwrite(overwrite: IResolvable)

      public fun s3Options(s3Options: IResolvable)

      public fun s3Options(s3Options: S3TableOutputOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d15bd4718f2f177d93f4a891e11f0dfe436114e63f06eaa7fbc97bab31dbc36")
      public fun s3Options(s3Options: S3TableOutputOptionsProperty.Builder.() -> Unit)

      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty.builder()

      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun databaseOptions(databaseOptions: IResolvable) {
        cdkBuilder.databaseOptions(databaseOptions.let(IResolvable::unwrap))
      }

      override fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty) {
        cdkBuilder.databaseOptions(databaseOptions.let(DatabaseTableOutputOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce4395f18fa301583c04a5e808f9abda747b3e0e7509e74a92caa05f01ac9e62")
      override
          fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty.Builder.() -> Unit):
          Unit = databaseOptions(DatabaseTableOutputOptionsProperty(databaseOptions))

      override fun overwrite(overwrite: Boolean) {
        cdkBuilder.overwrite(overwrite)
      }

      override fun overwrite(overwrite: IResolvable) {
        cdkBuilder.overwrite(overwrite.let(IResolvable::unwrap))
      }

      override fun s3Options(s3Options: IResolvable) {
        cdkBuilder.s3Options(s3Options.let(IResolvable::unwrap))
      }

      override fun s3Options(s3Options: S3TableOutputOptionsProperty) {
        cdkBuilder.s3Options(s3Options.let(S3TableOutputOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1d15bd4718f2f177d93f4a891e11f0dfe436114e63f06eaa7fbc97bab31dbc36")
      override fun s3Options(s3Options: S3TableOutputOptionsProperty.Builder.() -> Unit): Unit =
          s3Options(S3TableOutputOptionsProperty(s3Options))

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty,
    ) : DataCatalogOutputProperty {
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      override fun databaseName(): String = unwrap(this).getDatabaseName()

      override fun databaseOptions(): Any? = unwrap(this).getDatabaseOptions()

      override fun overwrite(): Any? = unwrap(this).getOverwrite()

      override fun s3Options(): Any? = unwrap(this).getS3Options()

      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataCatalogOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty):
          DataCatalogOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCatalogOutputProperty):
          software.amazon.awscdk.services.databrew.CfnJob.DataCatalogOutputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AllowedStatisticsProperty {
    public fun statistics(): List<String>

    public interface Builder {
      public fun statistics(statistics: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty.builder()

      override fun statistics(statistics: List<String>) {
        cdkBuilder.statistics(statistics)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty,
    ) : AllowedStatisticsProperty {
      override fun statistics(): List<String> = unwrap(this).getStatistics() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AllowedStatisticsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty):
          AllowedStatisticsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AllowedStatisticsProperty):
          software.amazon.awscdk.services.databrew.CfnJob.AllowedStatisticsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StatisticOverrideProperty {
    public fun parameters(): Any

    public fun statistic(): String

    public interface Builder {
      public fun parameters(parameters: IResolvable)

      public fun parameters(parameters: Map<String, String>)

      public fun statistic(statistic: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty.builder()

      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
      }

      override fun parameters(parameters: Map<String, String>) {
        cdkBuilder.parameters(parameters)
      }

      override fun statistic(statistic: String) {
        cdkBuilder.statistic(statistic)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty,
    ) : StatisticOverrideProperty {
      override fun parameters(): Any = unwrap(this).getParameters()

      override fun statistic(): String = unwrap(this).getStatistic()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StatisticOverrideProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty):
          StatisticOverrideProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatisticOverrideProperty):
          software.amazon.awscdk.services.databrew.CfnJob.StatisticOverrideProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CsvOutputOptionsProperty {
    public fun delimiter(): String? = unwrap(this).getDelimiter()

    public interface Builder {
      public fun delimiter(delimiter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty.builder()

      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty,
    ) : CsvOutputOptionsProperty {
      override fun delimiter(): String? = unwrap(this).getDelimiter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CsvOutputOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty):
          CsvOutputOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvOutputOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnJob.CsvOutputOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OutputProperty {
    public fun compressionFormat(): String? = unwrap(this).getCompressionFormat()

    public fun format(): String? = unwrap(this).getFormat()

    public fun formatOptions(): Any? = unwrap(this).getFormatOptions()

    public fun location(): Any

    public fun maxOutputFiles(): Number? = unwrap(this).getMaxOutputFiles()

    public fun overwrite(): Any? = unwrap(this).getOverwrite()

    public fun partitionColumns(): List<String> = unwrap(this).getPartitionColumns() ?: emptyList()

    public interface Builder {
      public fun compressionFormat(compressionFormat: String)

      public fun format(format: String)

      public fun formatOptions(formatOptions: IResolvable)

      public fun formatOptions(formatOptions: OutputFormatOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7839962fc021fba29606c84c0c1f2af7c3053d3d71d87a0eccef3a1d43d5a9d8")
      public fun formatOptions(formatOptions: OutputFormatOptionsProperty.Builder.() -> Unit)

      public fun location(location: IResolvable)

      public fun location(location: S3LocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb3769ff3eb925e87f899d0da733430132d44280d763d281c79e8a9563fb072d")
      public fun location(location: S3LocationProperty.Builder.() -> Unit)

      public fun maxOutputFiles(maxOutputFiles: Number)

      public fun overwrite(overwrite: Boolean)

      public fun overwrite(overwrite: IResolvable)

      public fun partitionColumns(partitionColumns: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnJob.OutputProperty.Builder
          = software.amazon.awscdk.services.databrew.CfnJob.OutputProperty.builder()

      override fun compressionFormat(compressionFormat: String) {
        cdkBuilder.compressionFormat(compressionFormat)
      }

      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      override fun formatOptions(formatOptions: IResolvable) {
        cdkBuilder.formatOptions(formatOptions.let(IResolvable::unwrap))
      }

      override fun formatOptions(formatOptions: OutputFormatOptionsProperty) {
        cdkBuilder.formatOptions(formatOptions.let(OutputFormatOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7839962fc021fba29606c84c0c1f2af7c3053d3d71d87a0eccef3a1d43d5a9d8")
      override fun formatOptions(formatOptions: OutputFormatOptionsProperty.Builder.() -> Unit):
          Unit = formatOptions(OutputFormatOptionsProperty(formatOptions))

      override fun location(location: IResolvable) {
        cdkBuilder.location(location.let(IResolvable::unwrap))
      }

      override fun location(location: S3LocationProperty) {
        cdkBuilder.location(location.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb3769ff3eb925e87f899d0da733430132d44280d763d281c79e8a9563fb072d")
      override fun location(location: S3LocationProperty.Builder.() -> Unit): Unit =
          location(S3LocationProperty(location))

      override fun maxOutputFiles(maxOutputFiles: Number) {
        cdkBuilder.maxOutputFiles(maxOutputFiles)
      }

      override fun overwrite(overwrite: Boolean) {
        cdkBuilder.overwrite(overwrite)
      }

      override fun overwrite(overwrite: IResolvable) {
        cdkBuilder.overwrite(overwrite.let(IResolvable::unwrap))
      }

      override fun partitionColumns(partitionColumns: List<String>) {
        cdkBuilder.partitionColumns(partitionColumns)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.OutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnJob.OutputProperty,
    ) : OutputProperty {
      override fun compressionFormat(): String? = unwrap(this).getCompressionFormat()

      override fun format(): String? = unwrap(this).getFormat()

      override fun formatOptions(): Any? = unwrap(this).getFormatOptions()

      override fun location(): Any = unwrap(this).getLocation()

      override fun maxOutputFiles(): Number? = unwrap(this).getMaxOutputFiles()

      override fun overwrite(): Any? = unwrap(this).getOverwrite()

      override fun partitionColumns(): List<String> = unwrap(this).getPartitionColumns() ?:
          emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.OutputProperty):
          OutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputProperty):
          software.amazon.awscdk.services.databrew.CfnJob.OutputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DatabaseTableOutputOptionsProperty {
    public fun tableName(): String

    public fun tempDirectory(): Any? = unwrap(this).getTempDirectory()

    public interface Builder {
      public fun tableName(tableName: String)

      public fun tempDirectory(tempDirectory: IResolvable)

      public fun tempDirectory(tempDirectory: S3LocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16da935a357eb6c65efef5f0570ae33313458f51bc5d3beef9127fdb6f79a5e0")
      public fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty.Builder
          =
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty.builder()

      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      override fun tempDirectory(tempDirectory: IResolvable) {
        cdkBuilder.tempDirectory(tempDirectory.let(IResolvable::unwrap))
      }

      override fun tempDirectory(tempDirectory: S3LocationProperty) {
        cdkBuilder.tempDirectory(tempDirectory.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("16da935a357eb6c65efef5f0570ae33313458f51bc5d3beef9127fdb6f79a5e0")
      override fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit): Unit =
          tempDirectory(S3LocationProperty(tempDirectory))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty,
    ) : DatabaseTableOutputOptionsProperty {
      override fun tableName(): String = unwrap(this).getTableName()

      override fun tempDirectory(): Any? = unwrap(this).getTempDirectory()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          DatabaseTableOutputOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty):
          DatabaseTableOutputOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseTableOutputOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseTableOutputOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ColumnSelectorProperty {
    public fun name(): String? = unwrap(this).getName()

    public fun regex(): String? = unwrap(this).getRegex()

    public interface Builder {
      public fun name(name: String)

      public fun regex(regex: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun regex(regex: String) {
        cdkBuilder.regex(regex)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty,
    ) : ColumnSelectorProperty {
      override fun name(): String? = unwrap(this).getName()

      override fun regex(): String? = unwrap(this).getRegex()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnSelectorProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty):
          ColumnSelectorProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnSelectorProperty):
          software.amazon.awscdk.services.databrew.CfnJob.ColumnSelectorProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EntityDetectorConfigurationProperty {
    public fun allowedStatistics(): Any? = unwrap(this).getAllowedStatistics()

    public fun entityTypes(): List<String>

    public interface Builder {
      public fun allowedStatistics(allowedStatistics: IResolvable)

      public fun allowedStatistics(allowedStatistics: AllowedStatisticsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18a52ea22ca052defefa3edb2935f140eea9a62c96d99a18fa5a366cc9a75b9b")
      public fun allowedStatistics(allowedStatistics: AllowedStatisticsProperty.Builder.() -> Unit)

      public fun entityTypes(entityTypes: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty.builder()

      override fun allowedStatistics(allowedStatistics: IResolvable) {
        cdkBuilder.allowedStatistics(allowedStatistics.let(IResolvable::unwrap))
      }

      override fun allowedStatistics(allowedStatistics: AllowedStatisticsProperty) {
        cdkBuilder.allowedStatistics(allowedStatistics.let(AllowedStatisticsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("18a52ea22ca052defefa3edb2935f140eea9a62c96d99a18fa5a366cc9a75b9b")
      override
          fun allowedStatistics(allowedStatistics: AllowedStatisticsProperty.Builder.() -> Unit):
          Unit = allowedStatistics(AllowedStatisticsProperty(allowedStatistics))

      override fun entityTypes(entityTypes: List<String>) {
        cdkBuilder.entityTypes(entityTypes)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty,
    ) : EntityDetectorConfigurationProperty {
      override fun allowedStatistics(): Any? = unwrap(this).getAllowedStatistics()

      override fun entityTypes(): List<String> = unwrap(this).getEntityTypes() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          EntityDetectorConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty):
          EntityDetectorConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntityDetectorConfigurationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.EntityDetectorConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ColumnStatisticsConfigurationProperty {
    public fun selectors(): Any? = unwrap(this).getSelectors()

    public fun statistics(): Any

    public interface Builder {
      public fun selectors(selectors: IResolvable)

      public fun selectors(selectors: List<Any>)

      public fun statistics(statistics: IResolvable)

      public fun statistics(statistics: StatisticsConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e3072c99b72c101cb44f2aa0c466c22019355c3795b79ee1a50ed0defa76fab")
      public fun statistics(statistics: StatisticsConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty.builder()

      override fun selectors(selectors: IResolvable) {
        cdkBuilder.selectors(selectors.let(IResolvable::unwrap))
      }

      override fun selectors(selectors: List<Any>) {
        cdkBuilder.selectors(selectors)
      }

      override fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics.let(IResolvable::unwrap))
      }

      override fun statistics(statistics: StatisticsConfigurationProperty) {
        cdkBuilder.statistics(statistics.let(StatisticsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e3072c99b72c101cb44f2aa0c466c22019355c3795b79ee1a50ed0defa76fab")
      override fun statistics(statistics: StatisticsConfigurationProperty.Builder.() -> Unit): Unit
          = statistics(StatisticsConfigurationProperty(statistics))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty,
    ) : ColumnStatisticsConfigurationProperty {
      override fun selectors(): Any? = unwrap(this).getSelectors()

      override fun statistics(): Any = unwrap(this).getStatistics()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          ColumnStatisticsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty):
          ColumnStatisticsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnStatisticsConfigurationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.ColumnStatisticsConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ValidationConfigurationProperty {
    public fun rulesetArn(): String

    public fun validationMode(): String? = unwrap(this).getValidationMode()

    public interface Builder {
      public fun rulesetArn(rulesetArn: String)

      public fun validationMode(validationMode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty.builder()

      override fun rulesetArn(rulesetArn: String) {
        cdkBuilder.rulesetArn(rulesetArn)
      }

      override fun validationMode(validationMode: String) {
        cdkBuilder.validationMode(validationMode)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty,
    ) : ValidationConfigurationProperty {
      override fun rulesetArn(): String = unwrap(this).getRulesetArn()

      override fun validationMode(): String? = unwrap(this).getValidationMode()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ValidationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty):
          ValidationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ValidationConfigurationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.ValidationConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface RecipeProperty {
    public fun name(): String

    public fun version(): String? = unwrap(this).getVersion()

    public interface Builder {
      public fun name(name: String)

      public fun version(version: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty.Builder
          = software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      override fun version(version: String) {
        cdkBuilder.version(version)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty,
    ) : RecipeProperty {
      override fun name(): String = unwrap(this).getName()

      override fun version(): String? = unwrap(this).getVersion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecipeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty):
          RecipeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecipeProperty):
          software.amazon.awscdk.services.databrew.CfnJob.RecipeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface StatisticsConfigurationProperty {
    public fun includedStatistics(): List<String> = unwrap(this).getIncludedStatistics() ?:
        emptyList()

    public fun overrides(): Any? = unwrap(this).getOverrides()

    public interface Builder {
      public fun includedStatistics(includedStatistics: List<String>)

      public fun overrides(overrides: IResolvable)

      public fun overrides(overrides: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty.builder()

      override fun includedStatistics(includedStatistics: List<String>) {
        cdkBuilder.includedStatistics(includedStatistics)
      }

      override fun overrides(overrides: IResolvable) {
        cdkBuilder.overrides(overrides.let(IResolvable::unwrap))
      }

      override fun overrides(overrides: List<Any>) {
        cdkBuilder.overrides(overrides)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty,
    ) : StatisticsConfigurationProperty {
      override fun includedStatistics(): List<String> = unwrap(this).getIncludedStatistics() ?:
          emptyList()

      override fun overrides(): Any? = unwrap(this).getOverrides()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StatisticsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty):
          StatisticsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StatisticsConfigurationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.StatisticsConfigurationProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface ProfileConfigurationProperty {
    public fun columnStatisticsConfigurations(): Any? =
        unwrap(this).getColumnStatisticsConfigurations()

    public fun datasetStatisticsConfiguration(): Any? =
        unwrap(this).getDatasetStatisticsConfiguration()

    public fun entityDetectorConfiguration(): Any? = unwrap(this).getEntityDetectorConfiguration()

    public fun profileColumns(): Any? = unwrap(this).getProfileColumns()

    public interface Builder {
      public fun columnStatisticsConfigurations(columnStatisticsConfigurations: IResolvable)

      public fun columnStatisticsConfigurations(columnStatisticsConfigurations: List<Any>)

      public fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: IResolvable)

      public
          fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: StatisticsConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("061b787e24cb4e82818805cf79278644db54356267fc0bbd8a69fde1df2ef0b3")
      public
          fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: StatisticsConfigurationProperty.Builder.() -> Unit)

      public fun entityDetectorConfiguration(entityDetectorConfiguration: IResolvable)

      public
          fun entityDetectorConfiguration(entityDetectorConfiguration: EntityDetectorConfigurationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8c051fde2cc8b2e6f39eb2dfc10b577b234699d332c2cf2842df9692a0e5d01")
      public
          fun entityDetectorConfiguration(entityDetectorConfiguration: EntityDetectorConfigurationProperty.Builder.() -> Unit)

      public fun profileColumns(profileColumns: IResolvable)

      public fun profileColumns(profileColumns: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty.builder()

      override fun columnStatisticsConfigurations(columnStatisticsConfigurations: IResolvable) {
        cdkBuilder.columnStatisticsConfigurations(columnStatisticsConfigurations.let(IResolvable::unwrap))
      }

      override fun columnStatisticsConfigurations(columnStatisticsConfigurations: List<Any>) {
        cdkBuilder.columnStatisticsConfigurations(columnStatisticsConfigurations)
      }

      override fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: IResolvable) {
        cdkBuilder.datasetStatisticsConfiguration(datasetStatisticsConfiguration.let(IResolvable::unwrap))
      }

      override
          fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: StatisticsConfigurationProperty) {
        cdkBuilder.datasetStatisticsConfiguration(datasetStatisticsConfiguration.let(StatisticsConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("061b787e24cb4e82818805cf79278644db54356267fc0bbd8a69fde1df2ef0b3")
      override
          fun datasetStatisticsConfiguration(datasetStatisticsConfiguration: StatisticsConfigurationProperty.Builder.() -> Unit):
          Unit =
          datasetStatisticsConfiguration(StatisticsConfigurationProperty(datasetStatisticsConfiguration))

      override fun entityDetectorConfiguration(entityDetectorConfiguration: IResolvable) {
        cdkBuilder.entityDetectorConfiguration(entityDetectorConfiguration.let(IResolvable::unwrap))
      }

      override
          fun entityDetectorConfiguration(entityDetectorConfiguration: EntityDetectorConfigurationProperty) {
        cdkBuilder.entityDetectorConfiguration(entityDetectorConfiguration.let(EntityDetectorConfigurationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d8c051fde2cc8b2e6f39eb2dfc10b577b234699d332c2cf2842df9692a0e5d01")
      override
          fun entityDetectorConfiguration(entityDetectorConfiguration: EntityDetectorConfigurationProperty.Builder.() -> Unit):
          Unit =
          entityDetectorConfiguration(EntityDetectorConfigurationProperty(entityDetectorConfiguration))

      override fun profileColumns(profileColumns: IResolvable) {
        cdkBuilder.profileColumns(profileColumns.let(IResolvable::unwrap))
      }

      override fun profileColumns(profileColumns: List<Any>) {
        cdkBuilder.profileColumns(profileColumns)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty,
    ) : ProfileConfigurationProperty {
      override fun columnStatisticsConfigurations(): Any? =
          unwrap(this).getColumnStatisticsConfigurations()

      override fun datasetStatisticsConfiguration(): Any? =
          unwrap(this).getDatasetStatisticsConfiguration()

      override fun entityDetectorConfiguration(): Any? =
          unwrap(this).getEntityDetectorConfiguration()

      override fun profileColumns(): Any? = unwrap(this).getProfileColumns()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ProfileConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty):
          ProfileConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ProfileConfigurationProperty):
          software.amazon.awscdk.services.databrew.CfnJob.ProfileConfigurationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface OutputFormatOptionsProperty {
    public fun csv(): Any? = unwrap(this).getCsv()

    public interface Builder {
      public fun csv(csv: IResolvable)

      public fun csv(csv: CsvOutputOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b05105eb14aeeb56d1114d1c8589bd24eed2eb4796c6cbab8243e92129ebabe")
      public fun csv(csv: CsvOutputOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty.builder()

      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable::unwrap))
      }

      override fun csv(csv: CsvOutputOptionsProperty) {
        cdkBuilder.csv(csv.let(CsvOutputOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7b05105eb14aeeb56d1114d1c8589bd24eed2eb4796c6cbab8243e92129ebabe")
      override fun csv(csv: CsvOutputOptionsProperty.Builder.() -> Unit): Unit =
          csv(CsvOutputOptionsProperty(csv))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty,
    ) : OutputFormatOptionsProperty {
      override fun csv(): Any? = unwrap(this).getCsv()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OutputFormatOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty):
          OutputFormatOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OutputFormatOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnJob.OutputFormatOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface S3TableOutputOptionsProperty {
    public fun location(): Any

    public interface Builder {
      public fun location(location: IResolvable)

      public fun location(location: S3LocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d68267f60a07432aaee729323c11d3267babe697374b61028568ea043fcd158")
      public fun location(location: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty.builder()

      override fun location(location: IResolvable) {
        cdkBuilder.location(location.let(IResolvable::unwrap))
      }

      override fun location(location: S3LocationProperty) {
        cdkBuilder.location(location.let(S3LocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d68267f60a07432aaee729323c11d3267babe697374b61028568ea043fcd158")
      override fun location(location: S3LocationProperty.Builder.() -> Unit): Unit =
          location(S3LocationProperty(location))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty,
    ) : S3TableOutputOptionsProperty {
      override fun location(): Any = unwrap(this).getLocation()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3TableOutputOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty):
          S3TableOutputOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3TableOutputOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnJob.S3TableOutputOptionsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DatabaseOutputProperty {
    public fun databaseOptions(): Any

    public fun databaseOutputMode(): String? = unwrap(this).getDatabaseOutputMode()

    public fun glueConnectionName(): String

    public interface Builder {
      public fun databaseOptions(databaseOptions: IResolvable)

      public fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1196af73934d09b1eecaedbf7ed5c6b2c76ac68dbb90adcf21f73f65f421c7b5")
      public
          fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty.Builder.() -> Unit)

      public fun databaseOutputMode(databaseOutputMode: String)

      public fun glueConnectionName(glueConnectionName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty.builder()

      override fun databaseOptions(databaseOptions: IResolvable) {
        cdkBuilder.databaseOptions(databaseOptions.let(IResolvable::unwrap))
      }

      override fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty) {
        cdkBuilder.databaseOptions(databaseOptions.let(DatabaseTableOutputOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1196af73934d09b1eecaedbf7ed5c6b2c76ac68dbb90adcf21f73f65f421c7b5")
      override
          fun databaseOptions(databaseOptions: DatabaseTableOutputOptionsProperty.Builder.() -> Unit):
          Unit = databaseOptions(DatabaseTableOutputOptionsProperty(databaseOptions))

      override fun databaseOutputMode(databaseOutputMode: String) {
        cdkBuilder.databaseOutputMode(databaseOutputMode)
      }

      override fun glueConnectionName(glueConnectionName: String) {
        cdkBuilder.glueConnectionName(glueConnectionName)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty,
    ) : DatabaseOutputProperty {
      override fun databaseOptions(): Any = unwrap(this).getDatabaseOptions()

      override fun databaseOutputMode(): String? = unwrap(this).getDatabaseOutputMode()

      override fun glueConnectionName(): String = unwrap(this).getGlueConnectionName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseOutputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty):
          DatabaseOutputProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseOutputProperty):
          software.amazon.awscdk.services.databrew.CfnJob.DatabaseOutputProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface JobSampleProperty {
    public fun mode(): String? = unwrap(this).getMode()

    public fun size(): Number? = unwrap(this).getSize()

    public interface Builder {
      public fun mode(mode: String)

      public fun size(size: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty.builder()

      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      override fun size(size: Number) {
        cdkBuilder.size(size)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty,
    ) : JobSampleProperty {
      override fun mode(): String? = unwrap(this).getMode()

      override fun size(): Number? = unwrap(this).getSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JobSampleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty):
          JobSampleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JobSampleProperty):
          software.amazon.awscdk.services.databrew.CfnJob.JobSampleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
