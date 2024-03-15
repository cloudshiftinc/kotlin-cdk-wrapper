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

public interface CfnThemeProps {
  public fun awsAccountId(): String

  public fun baseThemeId(): String

  public fun configuration(): Any

  public fun name(): String

  public fun permissions(): Any? = unwrap(this).getPermissions()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun themeId(): String

  public fun versionDescription(): String? = unwrap(this).getVersionDescription()

  @CdkDslMarker
  public interface Builder {
    public fun awsAccountId(awsAccountId: String)

    public fun baseThemeId(baseThemeId: String)

    public fun configuration(configuration: IResolvable)

    public fun configuration(configuration: CfnTheme.ThemeConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28e946efa67b3c2de9714e9ff481bff3c072f73a5c865f8c2ed6e44691164ab6")
    public fun configuration(configuration: CfnTheme.ThemeConfigurationProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun permissions(permissions: IResolvable)

    public fun permissions(permissions: List<Any>)

    public fun permissions(vararg permissions: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun themeId(themeId: String)

    public fun versionDescription(versionDescription: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnThemeProps.Builder =
        software.amazon.awscdk.services.quicksight.CfnThemeProps.builder()

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun baseThemeId(baseThemeId: String) {
      cdkBuilder.baseThemeId(baseThemeId)
    }

    override fun configuration(configuration: IResolvable) {
      cdkBuilder.configuration(configuration.let(IResolvable::unwrap))
    }

    override fun configuration(configuration: CfnTheme.ThemeConfigurationProperty) {
      cdkBuilder.configuration(configuration.let(CfnTheme.ThemeConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("28e946efa67b3c2de9714e9ff481bff3c072f73a5c865f8c2ed6e44691164ab6")
    override
        fun configuration(configuration: CfnTheme.ThemeConfigurationProperty.Builder.() -> Unit):
        Unit = configuration(CfnTheme.ThemeConfigurationProperty(configuration))

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

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun themeId(themeId: String) {
      cdkBuilder.themeId(themeId)
    }

    override fun versionDescription(versionDescription: String) {
      cdkBuilder.versionDescription(versionDescription)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnThemeProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.quicksight.CfnThemeProps,
  ) : CdkObject(cdkObject), CfnThemeProps {
    override fun awsAccountId(): String = unwrap(this).getAwsAccountId()

    override fun baseThemeId(): String = unwrap(this).getBaseThemeId()

    override fun configuration(): Any = unwrap(this).getConfiguration()

    override fun name(): String = unwrap(this).getName()

    override fun permissions(): Any? = unwrap(this).getPermissions()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun themeId(): String = unwrap(this).getThemeId()

    override fun versionDescription(): String? = unwrap(this).getVersionDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnThemeProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnThemeProps):
        CfnThemeProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnThemeProps):
        software.amazon.awscdk.services.quicksight.CfnThemeProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.quicksight.CfnThemeProps
  }
}
