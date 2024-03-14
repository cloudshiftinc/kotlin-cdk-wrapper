package io.cloudshiftdev.awscdk.services.quicksight

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDataSource internal constructor(
  private val cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun alternateDataSourceParameters(): Any? =
      unwrap(this).getAlternateDataSourceParameters()

  public open fun alternateDataSourceParameters(`value`: IResolvable) {
    unwrap(this).setAlternateDataSourceParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun alternateDataSourceParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setAlternateDataSourceParameters(__idx_ac66f0)
  }

  public open fun alternateDataSourceParameters(vararg __idx_ac66f0: Any): Unit =
      alternateDataSourceParameters(__idx_ac66f0.toList())

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrCreatedTime(): String = unwrap(this).getAttrCreatedTime()

  public open fun attrLastUpdatedTime(): String = unwrap(this).getAttrLastUpdatedTime()

  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  public open fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  public open fun credentials(): Any? = unwrap(this).getCredentials()

  public open fun credentials(`value`: IResolvable) {
    unwrap(this).setCredentials(`value`.let(IResolvable::unwrap))
  }

  public open fun credentials(`value`: DataSourceCredentialsProperty) {
    unwrap(this).setCredentials(`value`.let(DataSourceCredentialsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("df61786675ce00c1232499951939ae13cd98a579e214432c11273c41f126567d")
  public open fun credentials(`value`: DataSourceCredentialsProperty.Builder.() -> Unit): Unit =
      credentials(DataSourceCredentialsProperty(`value`))

  public open fun dataSourceId(): String? = unwrap(this).getDataSourceId()

  public open fun dataSourceId(`value`: String) {
    unwrap(this).setDataSourceId(`value`)
  }

  public open fun dataSourceParameters(): Any? = unwrap(this).getDataSourceParameters()

  public open fun dataSourceParameters(`value`: IResolvable) {
    unwrap(this).setDataSourceParameters(`value`.let(IResolvable::unwrap))
  }

  public open fun dataSourceParameters(`value`: DataSourceParametersProperty) {
    unwrap(this).setDataSourceParameters(`value`.let(DataSourceParametersProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c893daf1ad004b4692d7d96bf773829b227580c1075bc21b097c1dbd238908c8")
  public open fun dataSourceParameters(`value`: DataSourceParametersProperty.Builder.() -> Unit):
      Unit = dataSourceParameters(DataSourceParametersProperty(`value`))

  public open fun errorInfo(): Any? = unwrap(this).getErrorInfo()

  public open fun errorInfo(`value`: IResolvable) {
    unwrap(this).setErrorInfo(`value`.let(IResolvable::unwrap))
  }

  public open fun errorInfo(`value`: DataSourceErrorInfoProperty) {
    unwrap(this).setErrorInfo(`value`.let(DataSourceErrorInfoProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9ddc8fa021ece05fff344a70fa737c5c23224128797defc2ff07faceaddb1987")
  public open fun errorInfo(`value`: DataSourceErrorInfoProperty.Builder.() -> Unit): Unit =
      errorInfo(DataSourceErrorInfoProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun permissions(): Any? = unwrap(this).getPermissions()

  public open fun permissions(`value`: IResolvable) {
    unwrap(this).setPermissions(`value`.let(IResolvable::unwrap))
  }

  public open fun permissions(__idx_ac66f0: List<Any>) {
    unwrap(this).setPermissions(__idx_ac66f0)
  }

  public open fun permissions(vararg __idx_ac66f0: Any): Unit = permissions(__idx_ac66f0.toList())

  public open fun sslProperties(): Any? = unwrap(this).getSslProperties()

  public open fun sslProperties(`value`: IResolvable) {
    unwrap(this).setSslProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun sslProperties(`value`: SslPropertiesProperty) {
    unwrap(this).setSslProperties(`value`.let(SslPropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e002963bc13f87b032f33313b3132602720997159639f0cae74249efe102f653")
  public open fun sslProperties(`value`: SslPropertiesProperty.Builder.() -> Unit): Unit =
      sslProperties(SslPropertiesProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun type(): String? = unwrap(this).getType()

  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  public open fun vpcConnectionProperties(): Any? = unwrap(this).getVpcConnectionProperties()

  public open fun vpcConnectionProperties(`value`: IResolvable) {
    unwrap(this).setVpcConnectionProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun vpcConnectionProperties(`value`: VpcConnectionPropertiesProperty) {
    unwrap(this).setVpcConnectionProperties(`value`.let(VpcConnectionPropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("72afc2ff8bd25dd0fc143e3592f3bcfdd9b7a87503e2613b657f15697ba7a2ac")
  public open
      fun vpcConnectionProperties(`value`: VpcConnectionPropertiesProperty.Builder.() -> Unit): Unit
      = vpcConnectionProperties(VpcConnectionPropertiesProperty(`value`))

  public interface Builder {
    public fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable)

    public fun alternateDataSourceParameters(alternateDataSourceParameters: List<Any>)

    public fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any)

    public fun awsAccountId(awsAccountId: String)

    public fun credentials(credentials: IResolvable)

    public fun credentials(credentials: DataSourceCredentialsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e2fb1dc91492b09b3c8cb8098a14857a39a4b752aef8d30ca82f08de6b44140")
    public fun credentials(credentials: DataSourceCredentialsProperty.Builder.() -> Unit)

    public fun dataSourceId(dataSourceId: String)

    public fun dataSourceParameters(dataSourceParameters: IResolvable)

    public fun dataSourceParameters(dataSourceParameters: DataSourceParametersProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d0be218c60213d251370615a299fc07bd660fcf7619e829bbad962705616cfce")
    public
        fun dataSourceParameters(dataSourceParameters: DataSourceParametersProperty.Builder.() -> Unit)

    public fun errorInfo(errorInfo: IResolvable)

    public fun errorInfo(errorInfo: DataSourceErrorInfoProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52fd2007a60586cb2c41684fb7b1685a9c9618931c46f9309ddb447b490d4eac")
    public fun errorInfo(errorInfo: DataSourceErrorInfoProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun permissions(permissions: IResolvable)

    public fun permissions(permissions: List<Any>)

    public fun permissions(vararg permissions: Any)

    public fun sslProperties(sslProperties: IResolvable)

    public fun sslProperties(sslProperties: SslPropertiesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82bf32715672f83e73bde18ec71930c2e7d957f06953af1a5fb0b7d0a05d41cf")
    public fun sslProperties(sslProperties: SslPropertiesProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)

    public fun vpcConnectionProperties(vpcConnectionProperties: IResolvable)

    public fun vpcConnectionProperties(vpcConnectionProperties: VpcConnectionPropertiesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7bfc6df3cf4308b3f040563924f0b4079cf13e91a8fe81d69970d80c0b6a02f")
    public
        fun vpcConnectionProperties(vpcConnectionProperties: VpcConnectionPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnDataSource.Builder =
        software.amazon.awscdk.services.quicksight.CfnDataSource.Builder.create(scope, id)

    override fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable) {
      cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters.let(IResolvable::unwrap))
    }

    override fun alternateDataSourceParameters(alternateDataSourceParameters: List<Any>) {
      cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters)
    }

    override fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any): Unit =
        alternateDataSourceParameters(alternateDataSourceParameters.toList())

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun credentials(credentials: IResolvable) {
      cdkBuilder.credentials(credentials.let(IResolvable::unwrap))
    }

    override fun credentials(credentials: DataSourceCredentialsProperty) {
      cdkBuilder.credentials(credentials.let(DataSourceCredentialsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1e2fb1dc91492b09b3c8cb8098a14857a39a4b752aef8d30ca82f08de6b44140")
    override fun credentials(credentials: DataSourceCredentialsProperty.Builder.() -> Unit): Unit =
        credentials(DataSourceCredentialsProperty(credentials))

    override fun dataSourceId(dataSourceId: String) {
      cdkBuilder.dataSourceId(dataSourceId)
    }

    override fun dataSourceParameters(dataSourceParameters: IResolvable) {
      cdkBuilder.dataSourceParameters(dataSourceParameters.let(IResolvable::unwrap))
    }

    override fun dataSourceParameters(dataSourceParameters: DataSourceParametersProperty) {
      cdkBuilder.dataSourceParameters(dataSourceParameters.let(DataSourceParametersProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d0be218c60213d251370615a299fc07bd660fcf7619e829bbad962705616cfce")
    override
        fun dataSourceParameters(dataSourceParameters: DataSourceParametersProperty.Builder.() -> Unit):
        Unit = dataSourceParameters(DataSourceParametersProperty(dataSourceParameters))

    override fun errorInfo(errorInfo: IResolvable) {
      cdkBuilder.errorInfo(errorInfo.let(IResolvable::unwrap))
    }

    override fun errorInfo(errorInfo: DataSourceErrorInfoProperty) {
      cdkBuilder.errorInfo(errorInfo.let(DataSourceErrorInfoProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("52fd2007a60586cb2c41684fb7b1685a9c9618931c46f9309ddb447b490d4eac")
    override fun errorInfo(errorInfo: DataSourceErrorInfoProperty.Builder.() -> Unit): Unit =
        errorInfo(DataSourceErrorInfoProperty(errorInfo))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions)
    }

    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    override fun sslProperties(sslProperties: IResolvable) {
      cdkBuilder.sslProperties(sslProperties.let(IResolvable::unwrap))
    }

    override fun sslProperties(sslProperties: SslPropertiesProperty) {
      cdkBuilder.sslProperties(sslProperties.let(SslPropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("82bf32715672f83e73bde18ec71930c2e7d957f06953af1a5fb0b7d0a05d41cf")
    override fun sslProperties(sslProperties: SslPropertiesProperty.Builder.() -> Unit): Unit =
        sslProperties(SslPropertiesProperty(sslProperties))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun vpcConnectionProperties(vpcConnectionProperties: IResolvable) {
      cdkBuilder.vpcConnectionProperties(vpcConnectionProperties.let(IResolvable::unwrap))
    }

    override fun vpcConnectionProperties(vpcConnectionProperties: VpcConnectionPropertiesProperty) {
      cdkBuilder.vpcConnectionProperties(vpcConnectionProperties.let(VpcConnectionPropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e7bfc6df3cf4308b3f040563924f0b4079cf13e91a8fe81d69970d80c0b6a02f")
    override
        fun vpcConnectionProperties(vpcConnectionProperties: VpcConnectionPropertiesProperty.Builder.() -> Unit):
        Unit = vpcConnectionProperties(VpcConnectionPropertiesProperty(vpcConnectionProperties))

    public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSource =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataSource(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource):
        CfnDataSource = CfnDataSource(cdkObject)

    internal fun unwrap(wrapped: CfnDataSource):
        software.amazon.awscdk.services.quicksight.CfnDataSource = wrapped.cdkObject
  }

  public interface RdsParametersProperty {
    public fun database(): String

    public fun instanceId(): String

    public interface Builder {
      public fun database(database: String)

      public fun instanceId(instanceId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty.builder()

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun instanceId(instanceId: String) {
        cdkBuilder.instanceId(instanceId)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty,
    ) : RdsParametersProperty {
      override fun database(): String = unwrap(this).getDatabase()

      override fun instanceId(): String = unwrap(this).getInstanceId()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RdsParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty):
          RdsParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RdsParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.RdsParametersProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AuroraParametersProperty {
    public fun database(): String

    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun database(database: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty.builder()

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty,
    ) : AuroraParametersProperty {
      override fun database(): String = unwrap(this).getDatabase()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AuroraParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty):
          AuroraParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuroraParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RedshiftParametersProperty {
    public fun clusterId(): String? = unwrap(this).getClusterId()

    public fun database(): String

    public fun host(): String? = unwrap(this).getHost()

    public fun port(): Number? = unwrap(this).getPort()

    public interface Builder {
      public fun clusterId(clusterId: String)

      public fun database(database: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty.builder()

      override fun clusterId(clusterId: String) {
        cdkBuilder.clusterId(clusterId)
      }

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty,
    ) : RedshiftParametersProperty {
      override fun clusterId(): String? = unwrap(this).getClusterId()

      override fun database(): String = unwrap(this).getDatabase()

      override fun host(): String? = unwrap(this).getHost()

      override fun port(): Number? = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RedshiftParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty):
          RedshiftParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RedshiftParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.RedshiftParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TeradataParametersProperty {
    public fun database(): String

    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun database(database: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty.builder()

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty,
    ) : TeradataParametersProperty {
      override fun database(): String = unwrap(this).getDatabase()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TeradataParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty):
          TeradataParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TeradataParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.TeradataParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SslPropertiesProperty {
    public fun disableSsl(): Any? = unwrap(this).getDisableSsl()

    public interface Builder {
      public fun disableSsl(disableSsl: Boolean)

      public fun disableSsl(disableSsl: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty.builder()

      override fun disableSsl(disableSsl: Boolean) {
        cdkBuilder.disableSsl(disableSsl)
      }

      override fun disableSsl(disableSsl: IResolvable) {
        cdkBuilder.disableSsl(disableSsl.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty,
    ) : SslPropertiesProperty {
      override fun disableSsl(): Any? = unwrap(this).getDisableSsl()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SslPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty):
          SslPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SslPropertiesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.SslPropertiesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface OracleParametersProperty {
    public fun database(): String

    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun database(database: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty.builder()

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty,
    ) : OracleParametersProperty {
      override fun database(): String = unwrap(this).getDatabase()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OracleParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty):
          OracleParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OracleParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.OracleParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface VpcConnectionPropertiesProperty {
    public fun vpcConnectionArn(): String

    public interface Builder {
      public fun vpcConnectionArn(vpcConnectionArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty.builder()

      override fun vpcConnectionArn(vpcConnectionArn: String) {
        cdkBuilder.vpcConnectionArn(vpcConnectionArn)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty,
    ) : VpcConnectionPropertiesProperty {
      override fun vpcConnectionArn(): String = unwrap(this).getVpcConnectionArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConnectionPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty):
          VpcConnectionPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConnectionPropertiesProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.VpcConnectionPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface S3ParametersProperty {
    public fun manifestFileLocation(): Any

    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public interface Builder {
      public fun manifestFileLocation(manifestFileLocation: IResolvable)

      public fun manifestFileLocation(manifestFileLocation: ManifestFileLocationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d401bd5d60fc3f30f93f9b08f35377bfd666a889a4f66dc9c5e18ae4d64e6540")
      public
          fun manifestFileLocation(manifestFileLocation: ManifestFileLocationProperty.Builder.() -> Unit)

      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty.builder()

      override fun manifestFileLocation(manifestFileLocation: IResolvable) {
        cdkBuilder.manifestFileLocation(manifestFileLocation.let(IResolvable::unwrap))
      }

      override fun manifestFileLocation(manifestFileLocation: ManifestFileLocationProperty) {
        cdkBuilder.manifestFileLocation(manifestFileLocation.let(ManifestFileLocationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d401bd5d60fc3f30f93f9b08f35377bfd666a889a4f66dc9c5e18ae4d64e6540")
      override
          fun manifestFileLocation(manifestFileLocation: ManifestFileLocationProperty.Builder.() -> Unit):
          Unit = manifestFileLocation(ManifestFileLocationProperty(manifestFileLocation))

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty,
    ) : S3ParametersProperty {
      override fun manifestFileLocation(): Any = unwrap(this).getManifestFileLocation()

      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): S3ParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty):
          S3ParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.S3ParametersProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AuroraPostgreSqlParametersProperty {
    public fun database(): String

    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun database(database: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty.builder()

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty,
    ) : AuroraPostgreSqlParametersProperty {
      override fun database(): String = unwrap(this).getDatabase()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AuroraPostgreSqlParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty):
          AuroraPostgreSqlParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AuroraPostgreSqlParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.AuroraPostgreSqlParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface TrinoParametersProperty {
    public fun catalog(): String

    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun catalog(catalog: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty.builder()

      override fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty,
    ) : TrinoParametersProperty {
      override fun catalog(): String = unwrap(this).getCatalog()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TrinoParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty):
          TrinoParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TrinoParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.TrinoParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ResourcePermissionProperty {
    public fun actions(): List<String>

    public fun principal(): String

    public interface Builder {
      public fun actions(actions: List<String>)

      public fun actions(vararg actions: String)

      public fun principal(principal: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty.builder()

      override fun actions(actions: List<String>) {
        cdkBuilder.actions(actions)
      }

      override fun actions(vararg actions: String): Unit = actions(actions.toList())

      override fun principal(principal: String) {
        cdkBuilder.principal(principal)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty,
    ) : ResourcePermissionProperty {
      override fun actions(): List<String> = unwrap(this).getActions()

      override fun principal(): String = unwrap(this).getPrincipal()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ResourcePermissionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty):
          ResourcePermissionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourcePermissionProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.ResourcePermissionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PrestoParametersProperty {
    public fun catalog(): String

    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun catalog(catalog: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty.builder()

      override fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty,
    ) : PrestoParametersProperty {
      override fun catalog(): String = unwrap(this).getCatalog()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PrestoParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty):
          PrestoParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrestoParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.PrestoParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CredentialPairProperty {
    public fun alternateDataSourceParameters(): Any? =
        unwrap(this).getAlternateDataSourceParameters()

    public fun password(): String

    public fun username(): String

    public interface Builder {
      public fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable)

      public fun alternateDataSourceParameters(alternateDataSourceParameters: List<Any>)

      public fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any)

      public fun password(password: String)

      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty.builder()

      override fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable) {
        cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters.let(IResolvable::unwrap))
      }

      override fun alternateDataSourceParameters(alternateDataSourceParameters: List<Any>) {
        cdkBuilder.alternateDataSourceParameters(alternateDataSourceParameters)
      }

      override fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any): Unit =
          alternateDataSourceParameters(alternateDataSourceParameters.toList())

      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty,
    ) : CredentialPairProperty {
      override fun alternateDataSourceParameters(): Any? =
          unwrap(this).getAlternateDataSourceParameters()

      override fun password(): String = unwrap(this).getPassword()

      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CredentialPairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty):
          CredentialPairProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CredentialPairProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.CredentialPairProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface AmazonOpenSearchParametersProperty {
    public fun domain(): String

    public interface Builder {
      public fun domain(domain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty.builder()

      override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty,
    ) : AmazonOpenSearchParametersProperty {
      override fun domain(): String = unwrap(this).getDomain()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonOpenSearchParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty):
          AmazonOpenSearchParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonOpenSearchParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonOpenSearchParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataSourceParametersProperty {
    public fun amazonElasticsearchParameters(): Any? =
        unwrap(this).getAmazonElasticsearchParameters()

    public fun amazonOpenSearchParameters(): Any? = unwrap(this).getAmazonOpenSearchParameters()

    public fun athenaParameters(): Any? = unwrap(this).getAthenaParameters()

    public fun auroraParameters(): Any? = unwrap(this).getAuroraParameters()

    public fun auroraPostgreSqlParameters(): Any? = unwrap(this).getAuroraPostgreSqlParameters()

    public fun databricksParameters(): Any? = unwrap(this).getDatabricksParameters()

    public fun mariaDbParameters(): Any? = unwrap(this).getMariaDbParameters()

    public fun mySqlParameters(): Any? = unwrap(this).getMySqlParameters()

    public fun oracleParameters(): Any? = unwrap(this).getOracleParameters()

    public fun postgreSqlParameters(): Any? = unwrap(this).getPostgreSqlParameters()

    public fun prestoParameters(): Any? = unwrap(this).getPrestoParameters()

    public fun rdsParameters(): Any? = unwrap(this).getRdsParameters()

    public fun redshiftParameters(): Any? = unwrap(this).getRedshiftParameters()

    public fun s3Parameters(): Any? = unwrap(this).getS3Parameters()

    public fun snowflakeParameters(): Any? = unwrap(this).getSnowflakeParameters()

    public fun sparkParameters(): Any? = unwrap(this).getSparkParameters()

    public fun sqlServerParameters(): Any? = unwrap(this).getSqlServerParameters()

    public fun starburstParameters(): Any? = unwrap(this).getStarburstParameters()

    public fun teradataParameters(): Any? = unwrap(this).getTeradataParameters()

    public fun trinoParameters(): Any? = unwrap(this).getTrinoParameters()

    public interface Builder {
      public fun amazonElasticsearchParameters(amazonElasticsearchParameters: IResolvable)

      public
          fun amazonElasticsearchParameters(amazonElasticsearchParameters: AmazonElasticsearchParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2153c70132789fb56cdf408e1ebaeb585f6b8100e2aa4fc906cb2e2783da6b6")
      public
          fun amazonElasticsearchParameters(amazonElasticsearchParameters: AmazonElasticsearchParametersProperty.Builder.() -> Unit)

      public fun amazonOpenSearchParameters(amazonOpenSearchParameters: IResolvable)

      public
          fun amazonOpenSearchParameters(amazonOpenSearchParameters: AmazonOpenSearchParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cace02353382b977c42b8ea4949867a4ac2f45c324dbec1079d03c92602fe820")
      public
          fun amazonOpenSearchParameters(amazonOpenSearchParameters: AmazonOpenSearchParametersProperty.Builder.() -> Unit)

      public fun athenaParameters(athenaParameters: IResolvable)

      public fun athenaParameters(athenaParameters: AthenaParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c58f5ad5d332a2a7d756d8992973cc056883d53404b871da40918eb8cc03ac1d")
      public fun athenaParameters(athenaParameters: AthenaParametersProperty.Builder.() -> Unit)

      public fun auroraParameters(auroraParameters: IResolvable)

      public fun auroraParameters(auroraParameters: AuroraParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d09515b2d36772646c727317e28a694567ac706fe0a855130ad5c2a1b76f6844")
      public fun auroraParameters(auroraParameters: AuroraParametersProperty.Builder.() -> Unit)

      public fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: IResolvable)

      public
          fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: AuroraPostgreSqlParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d3c6d5ad96a230049ff450aafce3cd4c31de10c3420cdcbdc450ea3c5b556b2")
      public
          fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: AuroraPostgreSqlParametersProperty.Builder.() -> Unit)

      public fun databricksParameters(databricksParameters: IResolvable)

      public fun databricksParameters(databricksParameters: DatabricksParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f94d35e9ca8d723c5d7e8f8671be3ce033195932307971de6e56b5824d75daa")
      public
          fun databricksParameters(databricksParameters: DatabricksParametersProperty.Builder.() -> Unit)

      public fun mariaDbParameters(mariaDbParameters: IResolvable)

      public fun mariaDbParameters(mariaDbParameters: MariaDbParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8dfc6560f1ecfdee4e6c954ff83a8b783c6bb7e798d686f9a41eaf5c8d54097")
      public fun mariaDbParameters(mariaDbParameters: MariaDbParametersProperty.Builder.() -> Unit)

      public fun mySqlParameters(mySqlParameters: IResolvable)

      public fun mySqlParameters(mySqlParameters: MySqlParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e793ab3d603d10e4491bd0313ed0e779d66eceb0a5ba76fa715896f351ada4cc")
      public fun mySqlParameters(mySqlParameters: MySqlParametersProperty.Builder.() -> Unit)

      public fun oracleParameters(oracleParameters: IResolvable)

      public fun oracleParameters(oracleParameters: OracleParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79ee8e4204253b7e92de79cf58069a22766f6921f7c9146c1b22e24c4af230c7")
      public fun oracleParameters(oracleParameters: OracleParametersProperty.Builder.() -> Unit)

      public fun postgreSqlParameters(postgreSqlParameters: IResolvable)

      public fun postgreSqlParameters(postgreSqlParameters: PostgreSqlParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0843b21be6225317dfaa48505e7df79e575abbfefe2d32c4a8699d35290a145f")
      public
          fun postgreSqlParameters(postgreSqlParameters: PostgreSqlParametersProperty.Builder.() -> Unit)

      public fun prestoParameters(prestoParameters: IResolvable)

      public fun prestoParameters(prestoParameters: PrestoParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c78059515c713c0bf9b61e0177674e0b7a1a927ee4d1f56137e0249ee21226d2")
      public fun prestoParameters(prestoParameters: PrestoParametersProperty.Builder.() -> Unit)

      public fun rdsParameters(rdsParameters: IResolvable)

      public fun rdsParameters(rdsParameters: RdsParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca5d49532078df9da6d2eac5ef912be5d3969312e1067bdd2a904e7d32b1225f")
      public fun rdsParameters(rdsParameters: RdsParametersProperty.Builder.() -> Unit)

      public fun redshiftParameters(redshiftParameters: IResolvable)

      public fun redshiftParameters(redshiftParameters: RedshiftParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bea46f7205647aa4a150520dd27625d45546af4b1e51091246d80cb7514726f5")
      public
          fun redshiftParameters(redshiftParameters: RedshiftParametersProperty.Builder.() -> Unit)

      public fun s3Parameters(s3Parameters: IResolvable)

      public fun s3Parameters(s3Parameters: S3ParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d6a142b7a6d4336c3696e6e3c0c89099b11d31f470c6931c56cbfb102b20a20")
      public fun s3Parameters(s3Parameters: S3ParametersProperty.Builder.() -> Unit)

      public fun snowflakeParameters(snowflakeParameters: IResolvable)

      public fun snowflakeParameters(snowflakeParameters: SnowflakeParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a98c676b487887d316be1869cbbd3342b13057c96182da8a6d6ceef8cd5eb42")
      public
          fun snowflakeParameters(snowflakeParameters: SnowflakeParametersProperty.Builder.() -> Unit)

      public fun sparkParameters(sparkParameters: IResolvable)

      public fun sparkParameters(sparkParameters: SparkParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b72744628bc594ff8779b64b835ccca7b04fa83bba9a97fd1f9ae1dc433be00b")
      public fun sparkParameters(sparkParameters: SparkParametersProperty.Builder.() -> Unit)

      public fun sqlServerParameters(sqlServerParameters: IResolvable)

      public fun sqlServerParameters(sqlServerParameters: SqlServerParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07f1d510b965d1261f5828f33f04be6ef3437a9e1de4cb5fad330f3614b0c2b9")
      public
          fun sqlServerParameters(sqlServerParameters: SqlServerParametersProperty.Builder.() -> Unit)

      public fun starburstParameters(starburstParameters: IResolvable)

      public fun starburstParameters(starburstParameters: StarburstParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7e60cc94b7b984169f0774ce19bca38f94482a6fdf5b8db568b9cf2f4a70580")
      public
          fun starburstParameters(starburstParameters: StarburstParametersProperty.Builder.() -> Unit)

      public fun teradataParameters(teradataParameters: IResolvable)

      public fun teradataParameters(teradataParameters: TeradataParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc3042e9939672e0a8c2c616fe1a207e7898eadbcddbc2b9f7134a6e1393e834")
      public
          fun teradataParameters(teradataParameters: TeradataParametersProperty.Builder.() -> Unit)

      public fun trinoParameters(trinoParameters: IResolvable)

      public fun trinoParameters(trinoParameters: TrinoParametersProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("750e071517f85857906e681d642e8648c75d3c0402bd664ebd30f7debe29ccc3")
      public fun trinoParameters(trinoParameters: TrinoParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty.builder()

      override fun amazonElasticsearchParameters(amazonElasticsearchParameters: IResolvable) {
        cdkBuilder.amazonElasticsearchParameters(amazonElasticsearchParameters.let(IResolvable::unwrap))
      }

      override
          fun amazonElasticsearchParameters(amazonElasticsearchParameters: AmazonElasticsearchParametersProperty) {
        cdkBuilder.amazonElasticsearchParameters(amazonElasticsearchParameters.let(AmazonElasticsearchParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d2153c70132789fb56cdf408e1ebaeb585f6b8100e2aa4fc906cb2e2783da6b6")
      override
          fun amazonElasticsearchParameters(amazonElasticsearchParameters: AmazonElasticsearchParametersProperty.Builder.() -> Unit):
          Unit =
          amazonElasticsearchParameters(AmazonElasticsearchParametersProperty(amazonElasticsearchParameters))

      override fun amazonOpenSearchParameters(amazonOpenSearchParameters: IResolvable) {
        cdkBuilder.amazonOpenSearchParameters(amazonOpenSearchParameters.let(IResolvable::unwrap))
      }

      override
          fun amazonOpenSearchParameters(amazonOpenSearchParameters: AmazonOpenSearchParametersProperty) {
        cdkBuilder.amazonOpenSearchParameters(amazonOpenSearchParameters.let(AmazonOpenSearchParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cace02353382b977c42b8ea4949867a4ac2f45c324dbec1079d03c92602fe820")
      override
          fun amazonOpenSearchParameters(amazonOpenSearchParameters: AmazonOpenSearchParametersProperty.Builder.() -> Unit):
          Unit =
          amazonOpenSearchParameters(AmazonOpenSearchParametersProperty(amazonOpenSearchParameters))

      override fun athenaParameters(athenaParameters: IResolvable) {
        cdkBuilder.athenaParameters(athenaParameters.let(IResolvable::unwrap))
      }

      override fun athenaParameters(athenaParameters: AthenaParametersProperty) {
        cdkBuilder.athenaParameters(athenaParameters.let(AthenaParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c58f5ad5d332a2a7d756d8992973cc056883d53404b871da40918eb8cc03ac1d")
      override fun athenaParameters(athenaParameters: AthenaParametersProperty.Builder.() -> Unit):
          Unit = athenaParameters(AthenaParametersProperty(athenaParameters))

      override fun auroraParameters(auroraParameters: IResolvable) {
        cdkBuilder.auroraParameters(auroraParameters.let(IResolvable::unwrap))
      }

      override fun auroraParameters(auroraParameters: AuroraParametersProperty) {
        cdkBuilder.auroraParameters(auroraParameters.let(AuroraParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d09515b2d36772646c727317e28a694567ac706fe0a855130ad5c2a1b76f6844")
      override fun auroraParameters(auroraParameters: AuroraParametersProperty.Builder.() -> Unit):
          Unit = auroraParameters(AuroraParametersProperty(auroraParameters))

      override fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: IResolvable) {
        cdkBuilder.auroraPostgreSqlParameters(auroraPostgreSqlParameters.let(IResolvable::unwrap))
      }

      override
          fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: AuroraPostgreSqlParametersProperty) {
        cdkBuilder.auroraPostgreSqlParameters(auroraPostgreSqlParameters.let(AuroraPostgreSqlParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d3c6d5ad96a230049ff450aafce3cd4c31de10c3420cdcbdc450ea3c5b556b2")
      override
          fun auroraPostgreSqlParameters(auroraPostgreSqlParameters: AuroraPostgreSqlParametersProperty.Builder.() -> Unit):
          Unit =
          auroraPostgreSqlParameters(AuroraPostgreSqlParametersProperty(auroraPostgreSqlParameters))

      override fun databricksParameters(databricksParameters: IResolvable) {
        cdkBuilder.databricksParameters(databricksParameters.let(IResolvable::unwrap))
      }

      override fun databricksParameters(databricksParameters: DatabricksParametersProperty) {
        cdkBuilder.databricksParameters(databricksParameters.let(DatabricksParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9f94d35e9ca8d723c5d7e8f8671be3ce033195932307971de6e56b5824d75daa")
      override
          fun databricksParameters(databricksParameters: DatabricksParametersProperty.Builder.() -> Unit):
          Unit = databricksParameters(DatabricksParametersProperty(databricksParameters))

      override fun mariaDbParameters(mariaDbParameters: IResolvable) {
        cdkBuilder.mariaDbParameters(mariaDbParameters.let(IResolvable::unwrap))
      }

      override fun mariaDbParameters(mariaDbParameters: MariaDbParametersProperty) {
        cdkBuilder.mariaDbParameters(mariaDbParameters.let(MariaDbParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a8dfc6560f1ecfdee4e6c954ff83a8b783c6bb7e798d686f9a41eaf5c8d54097")
      override
          fun mariaDbParameters(mariaDbParameters: MariaDbParametersProperty.Builder.() -> Unit):
          Unit = mariaDbParameters(MariaDbParametersProperty(mariaDbParameters))

      override fun mySqlParameters(mySqlParameters: IResolvable) {
        cdkBuilder.mySqlParameters(mySqlParameters.let(IResolvable::unwrap))
      }

      override fun mySqlParameters(mySqlParameters: MySqlParametersProperty) {
        cdkBuilder.mySqlParameters(mySqlParameters.let(MySqlParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e793ab3d603d10e4491bd0313ed0e779d66eceb0a5ba76fa715896f351ada4cc")
      override fun mySqlParameters(mySqlParameters: MySqlParametersProperty.Builder.() -> Unit):
          Unit = mySqlParameters(MySqlParametersProperty(mySqlParameters))

      override fun oracleParameters(oracleParameters: IResolvable) {
        cdkBuilder.oracleParameters(oracleParameters.let(IResolvable::unwrap))
      }

      override fun oracleParameters(oracleParameters: OracleParametersProperty) {
        cdkBuilder.oracleParameters(oracleParameters.let(OracleParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("79ee8e4204253b7e92de79cf58069a22766f6921f7c9146c1b22e24c4af230c7")
      override fun oracleParameters(oracleParameters: OracleParametersProperty.Builder.() -> Unit):
          Unit = oracleParameters(OracleParametersProperty(oracleParameters))

      override fun postgreSqlParameters(postgreSqlParameters: IResolvable) {
        cdkBuilder.postgreSqlParameters(postgreSqlParameters.let(IResolvable::unwrap))
      }

      override fun postgreSqlParameters(postgreSqlParameters: PostgreSqlParametersProperty) {
        cdkBuilder.postgreSqlParameters(postgreSqlParameters.let(PostgreSqlParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0843b21be6225317dfaa48505e7df79e575abbfefe2d32c4a8699d35290a145f")
      override
          fun postgreSqlParameters(postgreSqlParameters: PostgreSqlParametersProperty.Builder.() -> Unit):
          Unit = postgreSqlParameters(PostgreSqlParametersProperty(postgreSqlParameters))

      override fun prestoParameters(prestoParameters: IResolvable) {
        cdkBuilder.prestoParameters(prestoParameters.let(IResolvable::unwrap))
      }

      override fun prestoParameters(prestoParameters: PrestoParametersProperty) {
        cdkBuilder.prestoParameters(prestoParameters.let(PrestoParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c78059515c713c0bf9b61e0177674e0b7a1a927ee4d1f56137e0249ee21226d2")
      override fun prestoParameters(prestoParameters: PrestoParametersProperty.Builder.() -> Unit):
          Unit = prestoParameters(PrestoParametersProperty(prestoParameters))

      override fun rdsParameters(rdsParameters: IResolvable) {
        cdkBuilder.rdsParameters(rdsParameters.let(IResolvable::unwrap))
      }

      override fun rdsParameters(rdsParameters: RdsParametersProperty) {
        cdkBuilder.rdsParameters(rdsParameters.let(RdsParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ca5d49532078df9da6d2eac5ef912be5d3969312e1067bdd2a904e7d32b1225f")
      override fun rdsParameters(rdsParameters: RdsParametersProperty.Builder.() -> Unit): Unit =
          rdsParameters(RdsParametersProperty(rdsParameters))

      override fun redshiftParameters(redshiftParameters: IResolvable) {
        cdkBuilder.redshiftParameters(redshiftParameters.let(IResolvable::unwrap))
      }

      override fun redshiftParameters(redshiftParameters: RedshiftParametersProperty) {
        cdkBuilder.redshiftParameters(redshiftParameters.let(RedshiftParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bea46f7205647aa4a150520dd27625d45546af4b1e51091246d80cb7514726f5")
      override
          fun redshiftParameters(redshiftParameters: RedshiftParametersProperty.Builder.() -> Unit):
          Unit = redshiftParameters(RedshiftParametersProperty(redshiftParameters))

      override fun s3Parameters(s3Parameters: IResolvable) {
        cdkBuilder.s3Parameters(s3Parameters.let(IResolvable::unwrap))
      }

      override fun s3Parameters(s3Parameters: S3ParametersProperty) {
        cdkBuilder.s3Parameters(s3Parameters.let(S3ParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d6a142b7a6d4336c3696e6e3c0c89099b11d31f470c6931c56cbfb102b20a20")
      override fun s3Parameters(s3Parameters: S3ParametersProperty.Builder.() -> Unit): Unit =
          s3Parameters(S3ParametersProperty(s3Parameters))

      override fun snowflakeParameters(snowflakeParameters: IResolvable) {
        cdkBuilder.snowflakeParameters(snowflakeParameters.let(IResolvable::unwrap))
      }

      override fun snowflakeParameters(snowflakeParameters: SnowflakeParametersProperty) {
        cdkBuilder.snowflakeParameters(snowflakeParameters.let(SnowflakeParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4a98c676b487887d316be1869cbbd3342b13057c96182da8a6d6ceef8cd5eb42")
      override
          fun snowflakeParameters(snowflakeParameters: SnowflakeParametersProperty.Builder.() -> Unit):
          Unit = snowflakeParameters(SnowflakeParametersProperty(snowflakeParameters))

      override fun sparkParameters(sparkParameters: IResolvable) {
        cdkBuilder.sparkParameters(sparkParameters.let(IResolvable::unwrap))
      }

      override fun sparkParameters(sparkParameters: SparkParametersProperty) {
        cdkBuilder.sparkParameters(sparkParameters.let(SparkParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b72744628bc594ff8779b64b835ccca7b04fa83bba9a97fd1f9ae1dc433be00b")
      override fun sparkParameters(sparkParameters: SparkParametersProperty.Builder.() -> Unit):
          Unit = sparkParameters(SparkParametersProperty(sparkParameters))

      override fun sqlServerParameters(sqlServerParameters: IResolvable) {
        cdkBuilder.sqlServerParameters(sqlServerParameters.let(IResolvable::unwrap))
      }

      override fun sqlServerParameters(sqlServerParameters: SqlServerParametersProperty) {
        cdkBuilder.sqlServerParameters(sqlServerParameters.let(SqlServerParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("07f1d510b965d1261f5828f33f04be6ef3437a9e1de4cb5fad330f3614b0c2b9")
      override
          fun sqlServerParameters(sqlServerParameters: SqlServerParametersProperty.Builder.() -> Unit):
          Unit = sqlServerParameters(SqlServerParametersProperty(sqlServerParameters))

      override fun starburstParameters(starburstParameters: IResolvable) {
        cdkBuilder.starburstParameters(starburstParameters.let(IResolvable::unwrap))
      }

      override fun starburstParameters(starburstParameters: StarburstParametersProperty) {
        cdkBuilder.starburstParameters(starburstParameters.let(StarburstParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7e60cc94b7b984169f0774ce19bca38f94482a6fdf5b8db568b9cf2f4a70580")
      override
          fun starburstParameters(starburstParameters: StarburstParametersProperty.Builder.() -> Unit):
          Unit = starburstParameters(StarburstParametersProperty(starburstParameters))

      override fun teradataParameters(teradataParameters: IResolvable) {
        cdkBuilder.teradataParameters(teradataParameters.let(IResolvable::unwrap))
      }

      override fun teradataParameters(teradataParameters: TeradataParametersProperty) {
        cdkBuilder.teradataParameters(teradataParameters.let(TeradataParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cc3042e9939672e0a8c2c616fe1a207e7898eadbcddbc2b9f7134a6e1393e834")
      override
          fun teradataParameters(teradataParameters: TeradataParametersProperty.Builder.() -> Unit):
          Unit = teradataParameters(TeradataParametersProperty(teradataParameters))

      override fun trinoParameters(trinoParameters: IResolvable) {
        cdkBuilder.trinoParameters(trinoParameters.let(IResolvable::unwrap))
      }

      override fun trinoParameters(trinoParameters: TrinoParametersProperty) {
        cdkBuilder.trinoParameters(trinoParameters.let(TrinoParametersProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("750e071517f85857906e681d642e8648c75d3c0402bd664ebd30f7debe29ccc3")
      override fun trinoParameters(trinoParameters: TrinoParametersProperty.Builder.() -> Unit):
          Unit = trinoParameters(TrinoParametersProperty(trinoParameters))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty,
    ) : DataSourceParametersProperty {
      override fun amazonElasticsearchParameters(): Any? =
          unwrap(this).getAmazonElasticsearchParameters()

      override fun amazonOpenSearchParameters(): Any? = unwrap(this).getAmazonOpenSearchParameters()

      override fun athenaParameters(): Any? = unwrap(this).getAthenaParameters()

      override fun auroraParameters(): Any? = unwrap(this).getAuroraParameters()

      override fun auroraPostgreSqlParameters(): Any? = unwrap(this).getAuroraPostgreSqlParameters()

      override fun databricksParameters(): Any? = unwrap(this).getDatabricksParameters()

      override fun mariaDbParameters(): Any? = unwrap(this).getMariaDbParameters()

      override fun mySqlParameters(): Any? = unwrap(this).getMySqlParameters()

      override fun oracleParameters(): Any? = unwrap(this).getOracleParameters()

      override fun postgreSqlParameters(): Any? = unwrap(this).getPostgreSqlParameters()

      override fun prestoParameters(): Any? = unwrap(this).getPrestoParameters()

      override fun rdsParameters(): Any? = unwrap(this).getRdsParameters()

      override fun redshiftParameters(): Any? = unwrap(this).getRedshiftParameters()

      override fun s3Parameters(): Any? = unwrap(this).getS3Parameters()

      override fun snowflakeParameters(): Any? = unwrap(this).getSnowflakeParameters()

      override fun sparkParameters(): Any? = unwrap(this).getSparkParameters()

      override fun sqlServerParameters(): Any? = unwrap(this).getSqlServerParameters()

      override fun starburstParameters(): Any? = unwrap(this).getStarburstParameters()

      override fun teradataParameters(): Any? = unwrap(this).getTeradataParameters()

      override fun trinoParameters(): Any? = unwrap(this).getTrinoParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty):
          DataSourceParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataSourceErrorInfoProperty {
    public fun message(): String? = unwrap(this).getMessage()

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun message(message: String)

      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty.builder()

      override fun message(message: String) {
        cdkBuilder.message(message)
      }

      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty,
    ) : DataSourceErrorInfoProperty {
      override fun message(): String? = unwrap(this).getMessage()

      override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceErrorInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty):
          DataSourceErrorInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceErrorInfoProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceErrorInfoProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SqlServerParametersProperty {
    public fun database(): String

    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun database(database: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty.builder()

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty,
    ) : SqlServerParametersProperty {
      override fun database(): String = unwrap(this).getDatabase()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SqlServerParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty):
          SqlServerParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SqlServerParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.SqlServerParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AthenaParametersProperty {
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    public fun workGroup(): String? = unwrap(this).getWorkGroup()

    public interface Builder {
      public fun roleArn(roleArn: String)

      public fun workGroup(workGroup: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty.builder()

      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      override fun workGroup(workGroup: String) {
        cdkBuilder.workGroup(workGroup)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty,
    ) : AthenaParametersProperty {
      override fun roleArn(): String? = unwrap(this).getRoleArn()

      override fun workGroup(): String? = unwrap(this).getWorkGroup()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AthenaParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty):
          AthenaParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AthenaParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.AthenaParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SnowflakeParametersProperty {
    public fun database(): String

    public fun host(): String

    public fun warehouse(): String

    public interface Builder {
      public fun database(database: String)

      public fun host(host: String)

      public fun warehouse(warehouse: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty.builder()

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun warehouse(warehouse: String) {
        cdkBuilder.warehouse(warehouse)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty,
    ) : SnowflakeParametersProperty {
      override fun database(): String = unwrap(this).getDatabase()

      override fun host(): String = unwrap(this).getHost()

      override fun warehouse(): String = unwrap(this).getWarehouse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SnowflakeParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty):
          SnowflakeParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SnowflakeParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.SnowflakeParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SparkParametersProperty {
    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty.builder()

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty,
    ) : SparkParametersProperty {
      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SparkParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty):
          SparkParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SparkParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.SparkParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface StarburstParametersProperty {
    public fun catalog(): String

    public fun host(): String

    public fun port(): Number

    public fun productType(): String? = unwrap(this).getProductType()

    public interface Builder {
      public fun catalog(catalog: String)

      public fun host(host: String)

      public fun port(port: Number)

      public fun productType(productType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty.builder()

      override fun catalog(catalog: String) {
        cdkBuilder.catalog(catalog)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun productType(productType: String) {
        cdkBuilder.productType(productType)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty,
    ) : StarburstParametersProperty {
      override fun catalog(): String = unwrap(this).getCatalog()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()

      override fun productType(): String? = unwrap(this).getProductType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): StarburstParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty):
          StarburstParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: StarburstParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.StarburstParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ManifestFileLocationProperty {
    public fun bucket(): String

    public fun key(): String

    public interface Builder {
      public fun bucket(bucket: String)

      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty.builder()

      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty,
    ) : ManifestFileLocationProperty {
      override fun bucket(): String = unwrap(this).getBucket()

      override fun key(): String = unwrap(this).getKey()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ManifestFileLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty):
          ManifestFileLocationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ManifestFileLocationProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.ManifestFileLocationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataSourceCredentialsProperty {
    public fun copySourceArn(): String? = unwrap(this).getCopySourceArn()

    public fun credentialPair(): Any? = unwrap(this).getCredentialPair()

    public fun secretArn(): String? = unwrap(this).getSecretArn()

    public interface Builder {
      public fun copySourceArn(copySourceArn: String)

      public fun credentialPair(credentialPair: IResolvable)

      public fun credentialPair(credentialPair: CredentialPairProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("315871381c49148e355518ab9833e78ced1546740cad061b89e892cea02829dc")
      public fun credentialPair(credentialPair: CredentialPairProperty.Builder.() -> Unit)

      public fun secretArn(secretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty.builder()

      override fun copySourceArn(copySourceArn: String) {
        cdkBuilder.copySourceArn(copySourceArn)
      }

      override fun credentialPair(credentialPair: IResolvable) {
        cdkBuilder.credentialPair(credentialPair.let(IResolvable::unwrap))
      }

      override fun credentialPair(credentialPair: CredentialPairProperty) {
        cdkBuilder.credentialPair(credentialPair.let(CredentialPairProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("315871381c49148e355518ab9833e78ced1546740cad061b89e892cea02829dc")
      override fun credentialPair(credentialPair: CredentialPairProperty.Builder.() -> Unit): Unit =
          credentialPair(CredentialPairProperty(credentialPair))

      override fun secretArn(secretArn: String) {
        cdkBuilder.secretArn(secretArn)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty,
    ) : DataSourceCredentialsProperty {
      override fun copySourceArn(): String? = unwrap(this).getCopySourceArn()

      override fun credentialPair(): Any? = unwrap(this).getCredentialPair()

      override fun secretArn(): String? = unwrap(this).getSecretArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty):
          DataSourceCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceCredentialsProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.DataSourceCredentialsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MySqlParametersProperty {
    public fun database(): String

    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun database(database: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty.builder()

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty,
    ) : MySqlParametersProperty {
      override fun database(): String = unwrap(this).getDatabase()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MySqlParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty):
          MySqlParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MySqlParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.MySqlParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface AmazonElasticsearchParametersProperty {
    public fun domain(): String

    public interface Builder {
      public fun domain(domain: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty.builder()

      override fun domain(domain: String) {
        cdkBuilder.domain(domain)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty,
    ) : AmazonElasticsearchParametersProperty {
      override fun domain(): String = unwrap(this).getDomain()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmazonElasticsearchParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty):
          AmazonElasticsearchParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmazonElasticsearchParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.AmazonElasticsearchParametersProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface DatabricksParametersProperty {
    public fun host(): String

    public fun port(): Number

    public fun sqlEndpointPath(): String

    public interface Builder {
      public fun host(host: String)

      public fun port(port: Number)

      public fun sqlEndpointPath(sqlEndpointPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty.builder()

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      override fun sqlEndpointPath(sqlEndpointPath: String) {
        cdkBuilder.sqlEndpointPath(sqlEndpointPath)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty,
    ) : DatabricksParametersProperty {
      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()

      override fun sqlEndpointPath(): String = unwrap(this).getSqlEndpointPath()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatabricksParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty):
          DatabricksParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabricksParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.DatabricksParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface PostgreSqlParametersProperty {
    public fun database(): String

    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun database(database: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty.builder()

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty,
    ) : PostgreSqlParametersProperty {
      override fun database(): String = unwrap(this).getDatabase()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PostgreSqlParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty):
          PostgreSqlParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PostgreSqlParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.PostgreSqlParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MariaDbParametersProperty {
    public fun database(): String

    public fun host(): String

    public fun port(): Number

    public interface Builder {
      public fun database(database: String)

      public fun host(host: String)

      public fun port(port: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty.builder()

      override fun database(database: String) {
        cdkBuilder.database(database)
      }

      override fun host(host: String) {
        cdkBuilder.host(host)
      }

      override fun port(port: Number) {
        cdkBuilder.port(port)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty,
    ) : MariaDbParametersProperty {
      override fun database(): String = unwrap(this).getDatabase()

      override fun host(): String = unwrap(this).getHost()

      override fun port(): Number = unwrap(this).getPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MariaDbParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty):
          MariaDbParametersProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MariaDbParametersProperty):
          software.amazon.awscdk.services.quicksight.CfnDataSource.MariaDbParametersProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
