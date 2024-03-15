@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnDataSourceProps {
  public fun alternateDataSourceParameters(): Any? = unwrap(this).getAlternateDataSourceParameters()

  public fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  public fun credentials(): Any? = unwrap(this).getCredentials()

  public fun dataSourceId(): String? = unwrap(this).getDataSourceId()

  public fun dataSourceParameters(): Any? = unwrap(this).getDataSourceParameters()

  public fun errorInfo(): Any? = unwrap(this).getErrorInfo()

  public fun name(): String? = unwrap(this).getName()

  public fun permissions(): Any? = unwrap(this).getPermissions()

  public fun sslProperties(): Any? = unwrap(this).getSslProperties()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun type(): String? = unwrap(this).getType()

  public fun vpcConnectionProperties(): Any? = unwrap(this).getVpcConnectionProperties()

  @CdkDslMarker
  public interface Builder {
    public fun alternateDataSourceParameters(alternateDataSourceParameters: IResolvable)

    public fun alternateDataSourceParameters(alternateDataSourceParameters: List<Any>)

    public fun alternateDataSourceParameters(vararg alternateDataSourceParameters: Any)

    public fun awsAccountId(awsAccountId: String)

    public fun credentials(credentials: IResolvable)

    public fun credentials(credentials: CfnDataSource.DataSourceCredentialsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94b6b359e14c5af0ec6a634cb12da67b4b802be31f0bdd780cf8b4d2eb68eaf1")
    public
        fun credentials(credentials: CfnDataSource.DataSourceCredentialsProperty.Builder.() -> Unit)

    public fun dataSourceId(dataSourceId: String)

    public fun dataSourceParameters(dataSourceParameters: IResolvable)

    public
        fun dataSourceParameters(dataSourceParameters: CfnDataSource.DataSourceParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12f3e23ae026f5f1109635cd9a81fdf12c775f459611e10050ecbcc22747d9b8")
    public
        fun dataSourceParameters(dataSourceParameters: CfnDataSource.DataSourceParametersProperty.Builder.() -> Unit)

    public fun errorInfo(errorInfo: IResolvable)

    public fun errorInfo(errorInfo: CfnDataSource.DataSourceErrorInfoProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("940209a500ffcaecdb951c48cf1f2043c693a9937c26643df99def8eae972df8")
    public fun errorInfo(errorInfo: CfnDataSource.DataSourceErrorInfoProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun permissions(permissions: IResolvable)

    public fun permissions(permissions: List<Any>)

    public fun permissions(vararg permissions: Any)

    public fun sslProperties(sslProperties: IResolvable)

    public fun sslProperties(sslProperties: CfnDataSource.SslPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bcf27d540594af2c8dc76349f94b8b25ef198e56c7699c1b7e39640ed60ac15")
    public fun sslProperties(sslProperties: CfnDataSource.SslPropertiesProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun type(type: String)

    public fun vpcConnectionProperties(vpcConnectionProperties: IResolvable)

    public
        fun vpcConnectionProperties(vpcConnectionProperties: CfnDataSource.VpcConnectionPropertiesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbfe7920df0f3021e69f9a8763d39adf3119156b3047661a69cd9f780d1e7e36")
    public
        fun vpcConnectionProperties(vpcConnectionProperties: CfnDataSource.VpcConnectionPropertiesProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnDataSourceProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnDataSourceProps.builder()

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

    override fun credentials(credentials: CfnDataSource.DataSourceCredentialsProperty) {
      cdkBuilder.credentials(credentials.let(CfnDataSource.DataSourceCredentialsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94b6b359e14c5af0ec6a634cb12da67b4b802be31f0bdd780cf8b4d2eb68eaf1")
    override
        fun credentials(credentials: CfnDataSource.DataSourceCredentialsProperty.Builder.() -> Unit):
        Unit = credentials(CfnDataSource.DataSourceCredentialsProperty(credentials))

    override fun dataSourceId(dataSourceId: String) {
      cdkBuilder.dataSourceId(dataSourceId)
    }

    override fun dataSourceParameters(dataSourceParameters: IResolvable) {
      cdkBuilder.dataSourceParameters(dataSourceParameters.let(IResolvable::unwrap))
    }

    override
        fun dataSourceParameters(dataSourceParameters: CfnDataSource.DataSourceParametersProperty) {
      cdkBuilder.dataSourceParameters(dataSourceParameters.let(CfnDataSource.DataSourceParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("12f3e23ae026f5f1109635cd9a81fdf12c775f459611e10050ecbcc22747d9b8")
    override
        fun dataSourceParameters(dataSourceParameters: CfnDataSource.DataSourceParametersProperty.Builder.() -> Unit):
        Unit =
        dataSourceParameters(CfnDataSource.DataSourceParametersProperty(dataSourceParameters))

    override fun errorInfo(errorInfo: IResolvable) {
      cdkBuilder.errorInfo(errorInfo.let(IResolvable::unwrap))
    }

    override fun errorInfo(errorInfo: CfnDataSource.DataSourceErrorInfoProperty) {
      cdkBuilder.errorInfo(errorInfo.let(CfnDataSource.DataSourceErrorInfoProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("940209a500ffcaecdb951c48cf1f2043c693a9937c26643df99def8eae972df8")
    override fun errorInfo(errorInfo: CfnDataSource.DataSourceErrorInfoProperty.Builder.() -> Unit):
        Unit = errorInfo(CfnDataSource.DataSourceErrorInfoProperty(errorInfo))

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

    override fun sslProperties(sslProperties: CfnDataSource.SslPropertiesProperty) {
      cdkBuilder.sslProperties(sslProperties.let(CfnDataSource.SslPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6bcf27d540594af2c8dc76349f94b8b25ef198e56c7699c1b7e39640ed60ac15")
    override
        fun sslProperties(sslProperties: CfnDataSource.SslPropertiesProperty.Builder.() -> Unit):
        Unit = sslProperties(CfnDataSource.SslPropertiesProperty(sslProperties))

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

    override
        fun vpcConnectionProperties(vpcConnectionProperties: CfnDataSource.VpcConnectionPropertiesProperty) {
      cdkBuilder.vpcConnectionProperties(vpcConnectionProperties.let(CfnDataSource.VpcConnectionPropertiesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbfe7920df0f3021e69f9a8763d39adf3119156b3047661a69cd9f780d1e7e36")
    override
        fun vpcConnectionProperties(vpcConnectionProperties: CfnDataSource.VpcConnectionPropertiesProperty.Builder.() -> Unit):
        Unit =
        vpcConnectionProperties(CfnDataSource.VpcConnectionPropertiesProperty(vpcConnectionProperties))

    public fun build(): software.amazon.awscdk.services.quicksight.CfnDataSourceProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSourceProps,
  ) : CdkObject(cdkObject), CfnDataSourceProps {
    override fun alternateDataSourceParameters(): Any? =
        unwrap(this).getAlternateDataSourceParameters()

    override fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

    override fun credentials(): Any? = unwrap(this).getCredentials()

    override fun dataSourceId(): String? = unwrap(this).getDataSourceId()

    override fun dataSourceParameters(): Any? = unwrap(this).getDataSourceParameters()

    override fun errorInfo(): Any? = unwrap(this).getErrorInfo()

    override fun name(): String? = unwrap(this).getName()

    override fun permissions(): Any? = unwrap(this).getPermissions()

    override fun sslProperties(): Any? = unwrap(this).getSslProperties()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun type(): String? = unwrap(this).getType()

    override fun vpcConnectionProperties(): Any? = unwrap(this).getVpcConnectionProperties()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDataSourceProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDataSourceProps):
        CfnDataSourceProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDataSourceProps):
        software.amazon.awscdk.services.quicksight.CfnDataSourceProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnDataSourceProps
  }
}
