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

public interface CfnDashboardProps {
  public fun awsAccountId(): String

  public fun dashboardId(): String

  public fun dashboardPublishOptions(): Any? = unwrap(this).getDashboardPublishOptions()

  public fun definition(): Any? = unwrap(this).getDefinition()

  public fun linkEntities(): List<String> = unwrap(this).getLinkEntities() ?: emptyList()

  public fun linkSharingConfiguration(): Any? = unwrap(this).getLinkSharingConfiguration()

  public fun name(): String

  public fun parameters(): Any? = unwrap(this).getParameters()

  public fun permissions(): Any? = unwrap(this).getPermissions()

  public fun sourceEntity(): Any? = unwrap(this).getSourceEntity()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun themeArn(): String? = unwrap(this).getThemeArn()

  public fun validationStrategy(): Any? = unwrap(this).getValidationStrategy()

  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  @CdkDslMarker
  public interface Builder {
    public fun awsAccountId(awsAccountId: String)

    public fun dashboardId(dashboardId: String)

    public fun dashboardPublishOptions(dashboardPublishOptions: IResolvable)

    public
        fun dashboardPublishOptions(dashboardPublishOptions: CfnDashboard.DashboardPublishOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("521cad66b24475f3536f61a35cce1e0730b9e30cbff100ce4afbb15a2c80f675")
    public
        fun dashboardPublishOptions(dashboardPublishOptions: CfnDashboard.DashboardPublishOptionsProperty.Builder.() -> Unit)

    public fun definition(definition: IResolvable)

    public fun definition(definition: CfnDashboard.DashboardVersionDefinitionProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0da9f3df5a8b6b57eb07e620534257232bd91095386fbebfd357f7eab1b2a8e")
    public
        fun definition(definition: CfnDashboard.DashboardVersionDefinitionProperty.Builder.() -> Unit)

    public fun linkEntities(linkEntities: List<String>)

    public fun linkEntities(vararg linkEntities: String)

    public fun linkSharingConfiguration(linkSharingConfiguration: IResolvable)

    public
        fun linkSharingConfiguration(linkSharingConfiguration: CfnDashboard.LinkSharingConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e13a7efac4d32ed39e805135181c2462719ba38882ab71120be719f532de30bb")
    public
        fun linkSharingConfiguration(linkSharingConfiguration: CfnDashboard.LinkSharingConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun parameters(parameters: IResolvable)

    public fun parameters(parameters: CfnDashboard.ParametersProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21550b4298c987419e492e58bf3138d109f919229d2151e5a190cf76f6454438")
    public fun parameters(parameters: CfnDashboard.ParametersProperty.Builder.() -> Unit)

    public fun permissions(permissions: IResolvable)

    public fun permissions(permissions: List<Any>)

    public fun permissions(vararg permissions: Any)

    public fun sourceEntity(sourceEntity: IResolvable)

    public fun sourceEntity(sourceEntity: CfnDashboard.DashboardSourceEntityProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06d6d1985526f583875a7e1e9cef738e944ac695f97729117b8404af6a960e75")
    public
        fun sourceEntity(sourceEntity: CfnDashboard.DashboardSourceEntityProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun themeArn(themeArn: String)

    public fun validationStrategy(validationStrategy: IResolvable)

    public fun validationStrategy(validationStrategy: CfnDashboard.ValidationStrategyProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("110e591738244c24664cf30e12c1a198588010ab6c0e466ab85c7ff75132646f")
    public
        fun validationStrategy(validationStrategy: CfnDashboard.ValidationStrategyProperty.Builder.() -> Unit)

    public fun versionDescription(versionDescription: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnDashboardProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnDashboardProps.builder()

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun dashboardId(dashboardId: String) {
      cdkBuilder.dashboardId(dashboardId)
    }

    override fun dashboardPublishOptions(dashboardPublishOptions: IResolvable) {
      cdkBuilder.dashboardPublishOptions(dashboardPublishOptions.let(IResolvable::unwrap))
    }

    override
        fun dashboardPublishOptions(dashboardPublishOptions: CfnDashboard.DashboardPublishOptionsProperty) {
      cdkBuilder.dashboardPublishOptions(dashboardPublishOptions.let(CfnDashboard.DashboardPublishOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("521cad66b24475f3536f61a35cce1e0730b9e30cbff100ce4afbb15a2c80f675")
    override
        fun dashboardPublishOptions(dashboardPublishOptions: CfnDashboard.DashboardPublishOptionsProperty.Builder.() -> Unit):
        Unit =
        dashboardPublishOptions(CfnDashboard.DashboardPublishOptionsProperty(dashboardPublishOptions))

    override fun definition(definition: IResolvable) {
      cdkBuilder.definition(definition.let(IResolvable::unwrap))
    }

    override fun definition(definition: CfnDashboard.DashboardVersionDefinitionProperty) {
      cdkBuilder.definition(definition.let(CfnDashboard.DashboardVersionDefinitionProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b0da9f3df5a8b6b57eb07e620534257232bd91095386fbebfd357f7eab1b2a8e")
    override
        fun definition(definition: CfnDashboard.DashboardVersionDefinitionProperty.Builder.() -> Unit):
        Unit = definition(CfnDashboard.DashboardVersionDefinitionProperty(definition))

    override fun linkEntities(linkEntities: List<String>) {
      cdkBuilder.linkEntities(linkEntities)
    }

    override fun linkEntities(vararg linkEntities: String): Unit =
        linkEntities(linkEntities.toList())

    override fun linkSharingConfiguration(linkSharingConfiguration: IResolvable) {
      cdkBuilder.linkSharingConfiguration(linkSharingConfiguration.let(IResolvable::unwrap))
    }

    override
        fun linkSharingConfiguration(linkSharingConfiguration: CfnDashboard.LinkSharingConfigurationProperty) {
      cdkBuilder.linkSharingConfiguration(linkSharingConfiguration.let(CfnDashboard.LinkSharingConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e13a7efac4d32ed39e805135181c2462719ba38882ab71120be719f532de30bb")
    override
        fun linkSharingConfiguration(linkSharingConfiguration: CfnDashboard.LinkSharingConfigurationProperty.Builder.() -> Unit):
        Unit =
        linkSharingConfiguration(CfnDashboard.LinkSharingConfigurationProperty(linkSharingConfiguration))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun parameters(parameters: IResolvable) {
      cdkBuilder.parameters(parameters.let(IResolvable::unwrap))
    }

    override fun parameters(parameters: CfnDashboard.ParametersProperty) {
      cdkBuilder.parameters(parameters.let(CfnDashboard.ParametersProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21550b4298c987419e492e58bf3138d109f919229d2151e5a190cf76f6454438")
    override fun parameters(parameters: CfnDashboard.ParametersProperty.Builder.() -> Unit): Unit =
        parameters(CfnDashboard.ParametersProperty(parameters))

    override fun permissions(permissions: IResolvable) {
      cdkBuilder.permissions(permissions.let(IResolvable::unwrap))
    }

    override fun permissions(permissions: List<Any>) {
      cdkBuilder.permissions(permissions)
    }

    override fun permissions(vararg permissions: Any): Unit = permissions(permissions.toList())

    override fun sourceEntity(sourceEntity: IResolvable) {
      cdkBuilder.sourceEntity(sourceEntity.let(IResolvable::unwrap))
    }

    override fun sourceEntity(sourceEntity: CfnDashboard.DashboardSourceEntityProperty) {
      cdkBuilder.sourceEntity(sourceEntity.let(CfnDashboard.DashboardSourceEntityProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06d6d1985526f583875a7e1e9cef738e944ac695f97729117b8404af6a960e75")
    override
        fun sourceEntity(sourceEntity: CfnDashboard.DashboardSourceEntityProperty.Builder.() -> Unit):
        Unit = sourceEntity(CfnDashboard.DashboardSourceEntityProperty(sourceEntity))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun themeArn(themeArn: String) {
      cdkBuilder.themeArn(themeArn)
    }

    override fun validationStrategy(validationStrategy: IResolvable) {
      cdkBuilder.validationStrategy(validationStrategy.let(IResolvable::unwrap))
    }

    override fun validationStrategy(validationStrategy: CfnDashboard.ValidationStrategyProperty) {
      cdkBuilder.validationStrategy(validationStrategy.let(CfnDashboard.ValidationStrategyProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("110e591738244c24664cf30e12c1a198588010ab6c0e466ab85c7ff75132646f")
    override
        fun validationStrategy(validationStrategy: CfnDashboard.ValidationStrategyProperty.Builder.() -> Unit):
        Unit = validationStrategy(CfnDashboard.ValidationStrategyProperty(validationStrategy))

    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnDashboardProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.quicksight.CfnDashboardProps,
  ) : CdkObject(cdkObject), CfnDashboardProps {
    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    override fun dashboardId(): String = unwrap(this).getDashboardId()

    override fun dashboardPublishOptions(): Any? = unwrap(this).getDashboardPublishOptions()

    override fun definition(): Any? = unwrap(this).getDefinition()

    override fun linkEntities(): List<String> = unwrap(this).getLinkEntities() ?: emptyList()

    override fun linkSharingConfiguration(): Any? = unwrap(this).getLinkSharingConfiguration()

    override fun name(): String = unwrap(this).getName()

    override fun parameters(): Any? = unwrap(this).getParameters()

    override fun permissions(): Any? = unwrap(this).getPermissions()

    override fun sourceEntity(): Any? = unwrap(this).getSourceEntity()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun themeArn(): String? = unwrap(this).getThemeArn()

    override fun validationStrategy(): Any? = unwrap(this).getValidationStrategy()

    override fun versionDescription(): String? = unwrap(this).getVersionDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDashboardProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnDashboardProps):
        CfnDashboardProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDashboardProps):
        software.amazon.awscdk.services.quicksight.CfnDashboardProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.quicksight.CfnDashboardProps
  }
}
