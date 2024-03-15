@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnBucketProps {
  public fun accessRules(): Any? = unwrap(this).getAccessRules()

  public fun bucketName(): String

  public fun bundleId(): String

  public fun objectVersioning(): Any? = unwrap(this).getObjectVersioning()

  public fun readOnlyAccessAccounts(): List<String> = unwrap(this).getReadOnlyAccessAccounts() ?:
      emptyList()

  public fun resourcesReceivingAccess(): List<String> = unwrap(this).getResourcesReceivingAccess()
      ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun accessRules(accessRules: IResolvable)

    public fun accessRules(accessRules: CfnBucket.AccessRulesProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea1463723c6b10addbe35f14de5ab5dab76c04e4ec31bad7ba73dad0e06ec143")
    public fun accessRules(accessRules: CfnBucket.AccessRulesProperty.Builder.() -> Unit)

    public fun bucketName(bucketName: String)

    public fun bundleId(bundleId: String)

    public fun objectVersioning(objectVersioning: Boolean)

    public fun objectVersioning(objectVersioning: IResolvable)

    public fun readOnlyAccessAccounts(readOnlyAccessAccounts: List<String>)

    public fun readOnlyAccessAccounts(vararg readOnlyAccessAccounts: String)

    public fun resourcesReceivingAccess(resourcesReceivingAccess: List<String>)

    public fun resourcesReceivingAccess(vararg resourcesReceivingAccess: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnBucketProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnBucketProps.builder()

    override fun accessRules(accessRules: IResolvable) {
      cdkBuilder.accessRules(accessRules.let(IResolvable::unwrap))
    }

    override fun accessRules(accessRules: CfnBucket.AccessRulesProperty) {
      cdkBuilder.accessRules(accessRules.let(CfnBucket.AccessRulesProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ea1463723c6b10addbe35f14de5ab5dab76c04e4ec31bad7ba73dad0e06ec143")
    override fun accessRules(accessRules: CfnBucket.AccessRulesProperty.Builder.() -> Unit): Unit =
        accessRules(CfnBucket.AccessRulesProperty(accessRules))

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun bundleId(bundleId: String) {
      cdkBuilder.bundleId(bundleId)
    }

    override fun objectVersioning(objectVersioning: Boolean) {
      cdkBuilder.objectVersioning(objectVersioning)
    }

    override fun objectVersioning(objectVersioning: IResolvable) {
      cdkBuilder.objectVersioning(objectVersioning.let(IResolvable::unwrap))
    }

    override fun readOnlyAccessAccounts(readOnlyAccessAccounts: List<String>) {
      cdkBuilder.readOnlyAccessAccounts(readOnlyAccessAccounts)
    }

    override fun readOnlyAccessAccounts(vararg readOnlyAccessAccounts: String): Unit =
        readOnlyAccessAccounts(readOnlyAccessAccounts.toList())

    override fun resourcesReceivingAccess(resourcesReceivingAccess: List<String>) {
      cdkBuilder.resourcesReceivingAccess(resourcesReceivingAccess)
    }

    override fun resourcesReceivingAccess(vararg resourcesReceivingAccess: String): Unit =
        resourcesReceivingAccess(resourcesReceivingAccess.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnBucketProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.lightsail.CfnBucketProps,
  ) : CdkObject(cdkObject), CfnBucketProps {
    override fun accessRules(): Any? = unwrap(this).getAccessRules()

    override fun bucketName(): String = unwrap(this).getBucketName()

    override fun bundleId(): String = unwrap(this).getBundleId()

    override fun objectVersioning(): Any? = unwrap(this).getObjectVersioning()

    override fun readOnlyAccessAccounts(): List<String> = unwrap(this).getReadOnlyAccessAccounts()
        ?: emptyList()

    override fun resourcesReceivingAccess(): List<String> =
        unwrap(this).getResourcesReceivingAccess() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnBucketProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnBucketProps):
        CfnBucketProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnBucketProps):
        software.amazon.awscdk.services.lightsail.CfnBucketProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.lightsail.CfnBucketProps
  }
}
