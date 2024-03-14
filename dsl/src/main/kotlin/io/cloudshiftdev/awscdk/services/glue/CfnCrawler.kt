package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCrawler internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun classifiers(): List<String> = unwrap(this).getClassifiers() ?: emptyList()

  public open fun classifiers(`value`: List<String>) {
    unwrap(this).setClassifiers(`value`)
  }

  public open fun classifiers(vararg `value`: String): Unit = classifiers(`value`.toList())

  public open fun configuration(): String? = unwrap(this).getConfiguration()

  public open fun configuration(`value`: String) {
    unwrap(this).setConfiguration(`value`)
  }

  public open fun crawlerSecurityConfiguration(): String? =
      unwrap(this).getCrawlerSecurityConfiguration()

  public open fun crawlerSecurityConfiguration(`value`: String) {
    unwrap(this).setCrawlerSecurityConfiguration(`value`)
  }

  public open fun databaseName(): String? = unwrap(this).getDatabaseName()

  public open fun databaseName(`value`: String) {
    unwrap(this).setDatabaseName(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun recrawlPolicy(): Any? = unwrap(this).getRecrawlPolicy()

  public open fun recrawlPolicy(`value`: IResolvable) {
    unwrap(this).setRecrawlPolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun recrawlPolicy(`value`: RecrawlPolicyProperty) {
    unwrap(this).setRecrawlPolicy(`value`.let(RecrawlPolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("09fed8f4eef13b0ea0626860b85955cc21bceb090515bcfb518210a4bdb4b5fb")
  public open fun recrawlPolicy(`value`: RecrawlPolicyProperty.Builder.() -> Unit): Unit =
      recrawlPolicy(RecrawlPolicyProperty(`value`))

  public open fun role(): String = unwrap(this).getRole()

  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  public open fun schedule(): Any? = unwrap(this).getSchedule()

  public open fun schedule(`value`: IResolvable) {
    unwrap(this).setSchedule(`value`.let(IResolvable::unwrap))
  }

  public open fun schedule(`value`: ScheduleProperty) {
    unwrap(this).setSchedule(`value`.let(ScheduleProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5633d9c796a85d98f1c57006fc714d1f065a39305374fd17df40123db4a7e04d")
  public open fun schedule(`value`: ScheduleProperty.Builder.() -> Unit): Unit =
      schedule(ScheduleProperty(`value`))

  public open fun schemaChangePolicy(): Any? = unwrap(this).getSchemaChangePolicy()

  public open fun schemaChangePolicy(`value`: IResolvable) {
    unwrap(this).setSchemaChangePolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun schemaChangePolicy(`value`: SchemaChangePolicyProperty) {
    unwrap(this).setSchemaChangePolicy(`value`.let(SchemaChangePolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("fe33944b1a08ade4e129bc0dc62c7a6f2791e469329f198a69669566073ff19f")
  public open fun schemaChangePolicy(`value`: SchemaChangePolicyProperty.Builder.() -> Unit): Unit =
      schemaChangePolicy(SchemaChangePolicyProperty(`value`))

  public open fun tablePrefix(): String? = unwrap(this).getTablePrefix()

  public open fun tablePrefix(`value`: String) {
    unwrap(this).setTablePrefix(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public open fun targets(): Any = unwrap(this).getTargets()

  public open fun targets(`value`: IResolvable) {
    unwrap(this).setTargets(`value`.let(IResolvable::unwrap))
  }

  public open fun targets(`value`: TargetsProperty) {
    unwrap(this).setTargets(`value`.let(TargetsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b5b9c12edf304f1fe865c731da232241bee912b7f43f1ee98266704083660b9e")
  public open fun targets(`value`: TargetsProperty.Builder.() -> Unit): Unit =
      targets(TargetsProperty(`value`))

  public interface Builder {
    public fun classifiers(classifiers: List<String>)

    public fun classifiers(vararg classifiers: String)

    public fun configuration(configuration: String)

    public fun crawlerSecurityConfiguration(crawlerSecurityConfiguration: String)

    public fun databaseName(databaseName: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun recrawlPolicy(recrawlPolicy: IResolvable)

    public fun recrawlPolicy(recrawlPolicy: RecrawlPolicyProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ba5594a016b6832aaa15f4ee49c0d1fb127a8678f8be249d8255e368f35d7a3")
    public fun recrawlPolicy(recrawlPolicy: RecrawlPolicyProperty.Builder.() -> Unit)

    public fun role(role: String)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: ScheduleProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a696fd1898cddc8c22693f98a8145cbc8b15e7bc3d6054d10900cc716e5d471")
    public fun schedule(schedule: ScheduleProperty.Builder.() -> Unit)

    public fun schemaChangePolicy(schemaChangePolicy: IResolvable)

    public fun schemaChangePolicy(schemaChangePolicy: SchemaChangePolicyProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b716e27af2a3d3a2fad1065e6f782d8ab4f64ae1928e7549f53995479842be3c")
    public fun schemaChangePolicy(schemaChangePolicy: SchemaChangePolicyProperty.Builder.() -> Unit)

    public fun tablePrefix(tablePrefix: String)

    public fun tags(tags: Any)

    public fun targets(targets: IResolvable)

    public fun targets(targets: TargetsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2cc3927cdad123b2c3fb3f63af5bb8db9e9dfaaa55ca1464764d438161323d7")
    public fun targets(targets: TargetsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnCrawler.Builder =
        software.amazon.awscdk.services.glue.CfnCrawler.Builder.create(scope, id)

    override fun classifiers(classifiers: List<String>) {
      cdkBuilder.classifiers(classifiers)
    }

    override fun classifiers(vararg classifiers: String): Unit = classifiers(classifiers.toList())

    override fun configuration(configuration: String) {
      cdkBuilder.configuration(configuration)
    }

    override fun crawlerSecurityConfiguration(crawlerSecurityConfiguration: String) {
      cdkBuilder.crawlerSecurityConfiguration(crawlerSecurityConfiguration)
    }

    override fun databaseName(databaseName: String) {
      cdkBuilder.databaseName(databaseName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun recrawlPolicy(recrawlPolicy: IResolvable) {
      cdkBuilder.recrawlPolicy(recrawlPolicy.let(IResolvable::unwrap))
    }

    override fun recrawlPolicy(recrawlPolicy: RecrawlPolicyProperty) {
      cdkBuilder.recrawlPolicy(recrawlPolicy.let(RecrawlPolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ba5594a016b6832aaa15f4ee49c0d1fb127a8678f8be249d8255e368f35d7a3")
    override fun recrawlPolicy(recrawlPolicy: RecrawlPolicyProperty.Builder.() -> Unit): Unit =
        recrawlPolicy(RecrawlPolicyProperty(recrawlPolicy))

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(ScheduleProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a696fd1898cddc8c22693f98a8145cbc8b15e7bc3d6054d10900cc716e5d471")
    override fun schedule(schedule: ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(ScheduleProperty(schedule))

    override fun schemaChangePolicy(schemaChangePolicy: IResolvable) {
      cdkBuilder.schemaChangePolicy(schemaChangePolicy.let(IResolvable::unwrap))
    }

    override fun schemaChangePolicy(schemaChangePolicy: SchemaChangePolicyProperty) {
      cdkBuilder.schemaChangePolicy(schemaChangePolicy.let(SchemaChangePolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b716e27af2a3d3a2fad1065e6f782d8ab4f64ae1928e7549f53995479842be3c")
    override
        fun schemaChangePolicy(schemaChangePolicy: SchemaChangePolicyProperty.Builder.() -> Unit):
        Unit = schemaChangePolicy(SchemaChangePolicyProperty(schemaChangePolicy))

    override fun tablePrefix(tablePrefix: String) {
      cdkBuilder.tablePrefix(tablePrefix)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: TargetsProperty) {
      cdkBuilder.targets(targets.let(TargetsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b2cc3927cdad123b2c3fb3f63af5bb8db9e9dfaaa55ca1464764d438161323d7")
    override fun targets(targets: TargetsProperty.Builder.() -> Unit): Unit =
        targets(TargetsProperty(targets))

    public fun build(): software.amazon.awscdk.services.glue.CfnCrawler = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCrawler {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCrawler(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler): CfnCrawler =
        CfnCrawler(cdkObject)

    internal fun unwrap(wrapped: CfnCrawler): software.amazon.awscdk.services.glue.CfnCrawler =
        wrapped.cdkObject
  }

  public interface S3TargetProperty {
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    public fun dlqEventQueueArn(): String? = unwrap(this).getDlqEventQueueArn()

    public fun eventQueueArn(): String? = unwrap(this).getEventQueueArn()

    public fun exclusions(): List<String> = unwrap(this).getExclusions() ?: emptyList()

    public fun path(): String? = unwrap(this).getPath()

    public fun sampleSize(): Number? = unwrap(this).getSampleSize()

    public interface Builder {
      public fun connectionName(connectionName: String)

      public fun dlqEventQueueArn(dlqEventQueueArn: String)

      public fun eventQueueArn(eventQueueArn: String)

      public fun exclusions(exclusions: List<String>)

      public fun exclusions(vararg exclusions: String)

      public fun path(path: String)

      public fun sampleSize(sampleSize: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty.builder()

      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      override fun dlqEventQueueArn(dlqEventQueueArn: String) {
        cdkBuilder.dlqEventQueueArn(dlqEventQueueArn)
      }

      override fun eventQueueArn(eventQueueArn: String) {
        cdkBuilder.eventQueueArn(eventQueueArn)
      }

      override fun exclusions(exclusions: List<String>) {
        cdkBuilder.exclusions(exclusions)
      }

      override fun exclusions(vararg exclusions: String): Unit = exclusions(exclusions.toList())

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      override fun sampleSize(sampleSize: Number) {
        cdkBuilder.sampleSize(sampleSize)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty,
    ) : S3TargetProperty {
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      override fun dlqEventQueueArn(): String? = unwrap(this).getDlqEventQueueArn()

      override fun eventQueueArn(): String? = unwrap(this).getEventQueueArn()

      override fun exclusions(): List<String> = unwrap(this).getExclusions() ?: emptyList()

      override fun path(): String? = unwrap(this).getPath()

      override fun sampleSize(): Number? = unwrap(this).getSampleSize()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3TargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty):
          S3TargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3TargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.S3TargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface RecrawlPolicyProperty {
    public fun recrawlBehavior(): String? = unwrap(this).getRecrawlBehavior()

    public interface Builder {
      public fun recrawlBehavior(recrawlBehavior: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty.builder()

      override fun recrawlBehavior(recrawlBehavior: String) {
        cdkBuilder.recrawlBehavior(recrawlBehavior)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty,
    ) : RecrawlPolicyProperty {
      override fun recrawlBehavior(): String? = unwrap(this).getRecrawlBehavior()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RecrawlPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty):
          RecrawlPolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecrawlPolicyProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface CatalogTargetProperty {
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    public fun dlqEventQueueArn(): String? = unwrap(this).getDlqEventQueueArn()

    public fun eventQueueArn(): String? = unwrap(this).getEventQueueArn()

    public fun tables(): List<String> = unwrap(this).getTables() ?: emptyList()

    public interface Builder {
      public fun connectionName(connectionName: String)

      public fun databaseName(databaseName: String)

      public fun dlqEventQueueArn(dlqEventQueueArn: String)

      public fun eventQueueArn(eventQueueArn: String)

      public fun tables(tables: List<String>)

      public fun tables(vararg tables: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty.builder()

      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      override fun dlqEventQueueArn(dlqEventQueueArn: String) {
        cdkBuilder.dlqEventQueueArn(dlqEventQueueArn)
      }

      override fun eventQueueArn(eventQueueArn: String) {
        cdkBuilder.eventQueueArn(eventQueueArn)
      }

      override fun tables(tables: List<String>) {
        cdkBuilder.tables(tables)
      }

      override fun tables(vararg tables: String): Unit = tables(tables.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty,
    ) : CatalogTargetProperty {
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      override fun dlqEventQueueArn(): String? = unwrap(this).getDlqEventQueueArn()

      override fun eventQueueArn(): String? = unwrap(this).getEventQueueArn()

      override fun tables(): List<String> = unwrap(this).getTables() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CatalogTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty):
          CatalogTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CatalogTargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.CatalogTargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface SchemaChangePolicyProperty {
    public fun deleteBehavior(): String? = unwrap(this).getDeleteBehavior()

    public fun updateBehavior(): String? = unwrap(this).getUpdateBehavior()

    public interface Builder {
      public fun deleteBehavior(deleteBehavior: String)

      public fun updateBehavior(updateBehavior: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty.builder()

      override fun deleteBehavior(deleteBehavior: String) {
        cdkBuilder.deleteBehavior(deleteBehavior)
      }

      override fun updateBehavior(updateBehavior: String) {
        cdkBuilder.updateBehavior(updateBehavior)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty,
    ) : SchemaChangePolicyProperty {
      override fun deleteBehavior(): String? = unwrap(this).getDeleteBehavior()

      override fun updateBehavior(): String? = unwrap(this).getUpdateBehavior()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaChangePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty):
          SchemaChangePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaChangePolicyProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DeltaTargetProperty {
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    public fun createNativeDeltaTable(): Any? = unwrap(this).getCreateNativeDeltaTable()

    public fun deltaTables(): List<String> = unwrap(this).getDeltaTables() ?: emptyList()

    public fun writeManifest(): Any? = unwrap(this).getWriteManifest()

    public interface Builder {
      public fun connectionName(connectionName: String)

      public fun createNativeDeltaTable(createNativeDeltaTable: Boolean)

      public fun createNativeDeltaTable(createNativeDeltaTable: IResolvable)

      public fun deltaTables(deltaTables: List<String>)

      public fun deltaTables(vararg deltaTables: String)

      public fun writeManifest(writeManifest: Boolean)

      public fun writeManifest(writeManifest: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty.builder()

      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      override fun createNativeDeltaTable(createNativeDeltaTable: Boolean) {
        cdkBuilder.createNativeDeltaTable(createNativeDeltaTable)
      }

      override fun createNativeDeltaTable(createNativeDeltaTable: IResolvable) {
        cdkBuilder.createNativeDeltaTable(createNativeDeltaTable.let(IResolvable::unwrap))
      }

      override fun deltaTables(deltaTables: List<String>) {
        cdkBuilder.deltaTables(deltaTables)
      }

      override fun deltaTables(vararg deltaTables: String): Unit = deltaTables(deltaTables.toList())

      override fun writeManifest(writeManifest: Boolean) {
        cdkBuilder.writeManifest(writeManifest)
      }

      override fun writeManifest(writeManifest: IResolvable) {
        cdkBuilder.writeManifest(writeManifest.let(IResolvable::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty,
    ) : DeltaTargetProperty {
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      override fun createNativeDeltaTable(): Any? = unwrap(this).getCreateNativeDeltaTable()

      override fun deltaTables(): List<String> = unwrap(this).getDeltaTables() ?: emptyList()

      override fun writeManifest(): Any? = unwrap(this).getWriteManifest()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeltaTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty):
          DeltaTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeltaTargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.DeltaTargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ScheduleProperty {
    public fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()

    public interface Builder {
      public fun scheduleExpression(scheduleExpression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty.builder()

      override fun scheduleExpression(scheduleExpression: String) {
        cdkBuilder.scheduleExpression(scheduleExpression)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty,
    ) : ScheduleProperty {
      override fun scheduleExpression(): String? = unwrap(this).getScheduleExpression()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ScheduleProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty):
          ScheduleProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ScheduleProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TargetsProperty {
    public fun catalogTargets(): Any? = unwrap(this).getCatalogTargets()

    public fun deltaTargets(): Any? = unwrap(this).getDeltaTargets()

    public fun dynamoDbTargets(): Any? = unwrap(this).getDynamoDbTargets()

    public fun icebergTargets(): Any? = unwrap(this).getIcebergTargets()

    public fun jdbcTargets(): Any? = unwrap(this).getJdbcTargets()

    public fun mongoDbTargets(): Any? = unwrap(this).getMongoDbTargets()

    public fun s3Targets(): Any? = unwrap(this).getS3Targets()

    public interface Builder {
      public fun catalogTargets(catalogTargets: IResolvable)

      public fun catalogTargets(catalogTargets: List<Any>)

      public fun catalogTargets(vararg catalogTargets: Any)

      public fun deltaTargets(deltaTargets: IResolvable)

      public fun deltaTargets(deltaTargets: List<Any>)

      public fun deltaTargets(vararg deltaTargets: Any)

      public fun dynamoDbTargets(dynamoDbTargets: IResolvable)

      public fun dynamoDbTargets(dynamoDbTargets: List<Any>)

      public fun dynamoDbTargets(vararg dynamoDbTargets: Any)

      public fun icebergTargets(icebergTargets: IResolvable)

      public fun icebergTargets(icebergTargets: List<Any>)

      public fun icebergTargets(vararg icebergTargets: Any)

      public fun jdbcTargets(jdbcTargets: IResolvable)

      public fun jdbcTargets(jdbcTargets: List<Any>)

      public fun jdbcTargets(vararg jdbcTargets: Any)

      public fun mongoDbTargets(mongoDbTargets: IResolvable)

      public fun mongoDbTargets(mongoDbTargets: List<Any>)

      public fun mongoDbTargets(vararg mongoDbTargets: Any)

      public fun s3Targets(s3Targets: IResolvable)

      public fun s3Targets(s3Targets: List<Any>)

      public fun s3Targets(vararg s3Targets: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty.builder()

      override fun catalogTargets(catalogTargets: IResolvable) {
        cdkBuilder.catalogTargets(catalogTargets.let(IResolvable::unwrap))
      }

      override fun catalogTargets(catalogTargets: List<Any>) {
        cdkBuilder.catalogTargets(catalogTargets)
      }

      override fun catalogTargets(vararg catalogTargets: Any): Unit =
          catalogTargets(catalogTargets.toList())

      override fun deltaTargets(deltaTargets: IResolvable) {
        cdkBuilder.deltaTargets(deltaTargets.let(IResolvable::unwrap))
      }

      override fun deltaTargets(deltaTargets: List<Any>) {
        cdkBuilder.deltaTargets(deltaTargets)
      }

      override fun deltaTargets(vararg deltaTargets: Any): Unit =
          deltaTargets(deltaTargets.toList())

      override fun dynamoDbTargets(dynamoDbTargets: IResolvable) {
        cdkBuilder.dynamoDbTargets(dynamoDbTargets.let(IResolvable::unwrap))
      }

      override fun dynamoDbTargets(dynamoDbTargets: List<Any>) {
        cdkBuilder.dynamoDbTargets(dynamoDbTargets)
      }

      override fun dynamoDbTargets(vararg dynamoDbTargets: Any): Unit =
          dynamoDbTargets(dynamoDbTargets.toList())

      override fun icebergTargets(icebergTargets: IResolvable) {
        cdkBuilder.icebergTargets(icebergTargets.let(IResolvable::unwrap))
      }

      override fun icebergTargets(icebergTargets: List<Any>) {
        cdkBuilder.icebergTargets(icebergTargets)
      }

      override fun icebergTargets(vararg icebergTargets: Any): Unit =
          icebergTargets(icebergTargets.toList())

      override fun jdbcTargets(jdbcTargets: IResolvable) {
        cdkBuilder.jdbcTargets(jdbcTargets.let(IResolvable::unwrap))
      }

      override fun jdbcTargets(jdbcTargets: List<Any>) {
        cdkBuilder.jdbcTargets(jdbcTargets)
      }

      override fun jdbcTargets(vararg jdbcTargets: Any): Unit = jdbcTargets(jdbcTargets.toList())

      override fun mongoDbTargets(mongoDbTargets: IResolvable) {
        cdkBuilder.mongoDbTargets(mongoDbTargets.let(IResolvable::unwrap))
      }

      override fun mongoDbTargets(mongoDbTargets: List<Any>) {
        cdkBuilder.mongoDbTargets(mongoDbTargets)
      }

      override fun mongoDbTargets(vararg mongoDbTargets: Any): Unit =
          mongoDbTargets(mongoDbTargets.toList())

      override fun s3Targets(s3Targets: IResolvable) {
        cdkBuilder.s3Targets(s3Targets.let(IResolvable::unwrap))
      }

      override fun s3Targets(s3Targets: List<Any>) {
        cdkBuilder.s3Targets(s3Targets)
      }

      override fun s3Targets(vararg s3Targets: Any): Unit = s3Targets(s3Targets.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty,
    ) : TargetsProperty {
      override fun catalogTargets(): Any? = unwrap(this).getCatalogTargets()

      override fun deltaTargets(): Any? = unwrap(this).getDeltaTargets()

      override fun dynamoDbTargets(): Any? = unwrap(this).getDynamoDbTargets()

      override fun icebergTargets(): Any? = unwrap(this).getIcebergTargets()

      override fun jdbcTargets(): Any? = unwrap(this).getJdbcTargets()

      override fun mongoDbTargets(): Any? = unwrap(this).getMongoDbTargets()

      override fun s3Targets(): Any? = unwrap(this).getS3Targets()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TargetsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty):
          TargetsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetsProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DynamoDBTargetProperty {
    public fun path(): String? = unwrap(this).getPath()

    public interface Builder {
      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty.builder()

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty,
    ) : DynamoDBTargetProperty {
      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DynamoDBTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty):
          DynamoDBTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DynamoDBTargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.DynamoDBTargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface MongoDBTargetProperty {
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    public fun path(): String? = unwrap(this).getPath()

    public interface Builder {
      public fun connectionName(connectionName: String)

      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty.builder()

      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty,
    ) : MongoDBTargetProperty {
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MongoDBTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty):
          MongoDBTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MongoDBTargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.MongoDBTargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface IcebergTargetProperty {
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    public fun exclusions(): List<String> = unwrap(this).getExclusions() ?: emptyList()

    public fun maximumTraversalDepth(): Number? = unwrap(this).getMaximumTraversalDepth()

    public fun paths(): List<String> = unwrap(this).getPaths() ?: emptyList()

    public interface Builder {
      public fun connectionName(connectionName: String)

      public fun exclusions(exclusions: List<String>)

      public fun exclusions(vararg exclusions: String)

      public fun maximumTraversalDepth(maximumTraversalDepth: Number)

      public fun paths(paths: List<String>)

      public fun paths(vararg paths: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty.builder()

      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      override fun exclusions(exclusions: List<String>) {
        cdkBuilder.exclusions(exclusions)
      }

      override fun exclusions(vararg exclusions: String): Unit = exclusions(exclusions.toList())

      override fun maximumTraversalDepth(maximumTraversalDepth: Number) {
        cdkBuilder.maximumTraversalDepth(maximumTraversalDepth)
      }

      override fun paths(paths: List<String>) {
        cdkBuilder.paths(paths)
      }

      override fun paths(vararg paths: String): Unit = paths(paths.toList())

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty,
    ) : IcebergTargetProperty {
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      override fun exclusions(): List<String> = unwrap(this).getExclusions() ?: emptyList()

      override fun maximumTraversalDepth(): Number? = unwrap(this).getMaximumTraversalDepth()

      override fun paths(): List<String> = unwrap(this).getPaths() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): IcebergTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty):
          IcebergTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: IcebergTargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.IcebergTargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface JdbcTargetProperty {
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    public fun exclusions(): List<String> = unwrap(this).getExclusions() ?: emptyList()

    public fun path(): String? = unwrap(this).getPath()

    public interface Builder {
      public fun connectionName(connectionName: String)

      public fun exclusions(exclusions: List<String>)

      public fun exclusions(vararg exclusions: String)

      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty.Builder =
          software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty.builder()

      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      override fun exclusions(exclusions: List<String>) {
        cdkBuilder.exclusions(exclusions)
      }

      override fun exclusions(vararg exclusions: String): Unit = exclusions(exclusions.toList())

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty,
    ) : JdbcTargetProperty {
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      override fun exclusions(): List<String> = unwrap(this).getExclusions() ?: emptyList()

      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): JdbcTargetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty):
          JdbcTargetProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: JdbcTargetProperty):
          software.amazon.awscdk.services.glue.CfnCrawler.JdbcTargetProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
