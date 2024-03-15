@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCrawlerProps {
  public fun classifiers(): List<String> = unwrap(this).getClassifiers() ?: emptyList()

  public fun configuration(): String? = unwrap(this).getConfiguration()

  public fun crawlerSecurityConfiguration(): String? =
      unwrap(this).getCrawlerSecurityConfiguration()

  public fun databaseName(): String? = unwrap(this).getDatabaseName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun name(): String? = unwrap(this).getName()

  public fun recrawlPolicy(): Any? = unwrap(this).getRecrawlPolicy()

  public fun role(): String

  public fun schedule(): Any? = unwrap(this).getSchedule()

  public fun schemaChangePolicy(): Any? = unwrap(this).getSchemaChangePolicy()

  public fun tablePrefix(): String? = unwrap(this).getTablePrefix()

  public fun tags(): Any? = unwrap(this).getTags()

  public fun targets(): Any

  @CdkDslMarker
  public interface Builder {
    public fun classifiers(classifiers: List<String>)

    public fun classifiers(vararg classifiers: String)

    public fun configuration(configuration: String)

    public fun crawlerSecurityConfiguration(crawlerSecurityConfiguration: String)

    public fun databaseName(databaseName: String)

    public fun description(description: String)

    public fun name(name: String)

    public fun recrawlPolicy(recrawlPolicy: IResolvable)

    public fun recrawlPolicy(recrawlPolicy: CfnCrawler.RecrawlPolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00fafccc921a42e918189ca7bbe2e5878273b6f4ba995cdc403a900164ed5f13")
    public fun recrawlPolicy(recrawlPolicy: CfnCrawler.RecrawlPolicyProperty.Builder.() -> Unit)

    public fun role(role: String)

    public fun schedule(schedule: IResolvable)

    public fun schedule(schedule: CfnCrawler.ScheduleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f53ad6b835d6e9c3a7aed497e70ab6a240cb960792c1f6ffd5ca3ea4fe4c29a")
    public fun schedule(schedule: CfnCrawler.ScheduleProperty.Builder.() -> Unit)

    public fun schemaChangePolicy(schemaChangePolicy: IResolvable)

    public fun schemaChangePolicy(schemaChangePolicy: CfnCrawler.SchemaChangePolicyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e321b78f263ba19d1986c5aa4b054e4fd0646a81e6d1690010437ea093643eb1")
    public
        fun schemaChangePolicy(schemaChangePolicy: CfnCrawler.SchemaChangePolicyProperty.Builder.() -> Unit)

    public fun tablePrefix(tablePrefix: String)

    public fun tags(tags: Any)

    public fun targets(targets: IResolvable)

    public fun targets(targets: CfnCrawler.TargetsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cf831b43bbde48b01205bcd7adb62a65674aed6667bef5112a6c900306bbbcc")
    public fun targets(targets: CfnCrawler.TargetsProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnCrawlerProps.Builder =
        software.amazon.awscdk.services.glue.CfnCrawlerProps.builder()

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

    override fun recrawlPolicy(recrawlPolicy: CfnCrawler.RecrawlPolicyProperty) {
      cdkBuilder.recrawlPolicy(recrawlPolicy.let(CfnCrawler.RecrawlPolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("00fafccc921a42e918189ca7bbe2e5878273b6f4ba995cdc403a900164ed5f13")
    override fun recrawlPolicy(recrawlPolicy: CfnCrawler.RecrawlPolicyProperty.Builder.() -> Unit):
        Unit = recrawlPolicy(CfnCrawler.RecrawlPolicyProperty(recrawlPolicy))

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun schedule(schedule: IResolvable) {
      cdkBuilder.schedule(schedule.let(IResolvable::unwrap))
    }

    override fun schedule(schedule: CfnCrawler.ScheduleProperty) {
      cdkBuilder.schedule(schedule.let(CfnCrawler.ScheduleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f53ad6b835d6e9c3a7aed497e70ab6a240cb960792c1f6ffd5ca3ea4fe4c29a")
    override fun schedule(schedule: CfnCrawler.ScheduleProperty.Builder.() -> Unit): Unit =
        schedule(CfnCrawler.ScheduleProperty(schedule))

    override fun schemaChangePolicy(schemaChangePolicy: IResolvable) {
      cdkBuilder.schemaChangePolicy(schemaChangePolicy.let(IResolvable::unwrap))
    }

    override fun schemaChangePolicy(schemaChangePolicy: CfnCrawler.SchemaChangePolicyProperty) {
      cdkBuilder.schemaChangePolicy(schemaChangePolicy.let(CfnCrawler.SchemaChangePolicyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e321b78f263ba19d1986c5aa4b054e4fd0646a81e6d1690010437ea093643eb1")
    override
        fun schemaChangePolicy(schemaChangePolicy: CfnCrawler.SchemaChangePolicyProperty.Builder.() -> Unit):
        Unit = schemaChangePolicy(CfnCrawler.SchemaChangePolicyProperty(schemaChangePolicy))

    override fun tablePrefix(tablePrefix: String) {
      cdkBuilder.tablePrefix(tablePrefix)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    override fun targets(targets: IResolvable) {
      cdkBuilder.targets(targets.let(IResolvable::unwrap))
    }

    override fun targets(targets: CfnCrawler.TargetsProperty) {
      cdkBuilder.targets(targets.let(CfnCrawler.TargetsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4cf831b43bbde48b01205bcd7adb62a65674aed6667bef5112a6c900306bbbcc")
    override fun targets(targets: CfnCrawler.TargetsProperty.Builder.() -> Unit): Unit =
        targets(CfnCrawler.TargetsProperty(targets))

    public fun build(): software.amazon.awscdk.services.glue.CfnCrawlerProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.glue.CfnCrawlerProps,
  ) : CdkObject(cdkObject), CfnCrawlerProps {
    override fun classifiers(): List<String> = unwrap(this).getClassifiers() ?: emptyList()

    override fun configuration(): String? = unwrap(this).getConfiguration()

    override fun crawlerSecurityConfiguration(): String? =
        unwrap(this).getCrawlerSecurityConfiguration()

    override fun databaseName(): String? = unwrap(this).getDatabaseName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun name(): String? = unwrap(this).getName()

    override fun recrawlPolicy(): Any? = unwrap(this).getRecrawlPolicy()

    override fun role(): String = unwrap(this).getRole()

    override fun schedule(): Any? = unwrap(this).getSchedule()

    override fun schemaChangePolicy(): Any? = unwrap(this).getSchemaChangePolicy()

    override fun tablePrefix(): String? = unwrap(this).getTablePrefix()

    override fun tags(): Any? = unwrap(this).getTags()

    override fun targets(): Any = unwrap(this).getTargets()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCrawlerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnCrawlerProps):
        CfnCrawlerProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCrawlerProps):
        software.amazon.awscdk.services.glue.CfnCrawlerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnCrawlerProps
  }
}
