package io.cloudshiftdev.awscdk

import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface ICfnResourceOptions {
  public fun condition(): CfnCondition? = unwrap(this).getCondition()?.let(CfnCondition::wrap)

  public fun condition(`value`: CfnCondition) {
    unwrap(this).setCondition(`value`.let(CfnCondition::unwrap))
  }

  public fun creationPolicy(): CfnCreationPolicy? =
      unwrap(this).getCreationPolicy()?.let(CfnCreationPolicy::wrap)

  public fun creationPolicy(`value`: CfnCreationPolicy) {
    unwrap(this).setCreationPolicy(`value`.let(CfnCreationPolicy::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9f9d917a5cde8d1fde292583205fe2e655a58f531b5b04be946bdc3c8b4e87fd")
  public fun creationPolicy(`value`: CfnCreationPolicy.Builder.() -> Unit): Unit =
      creationPolicy(CfnCreationPolicy(`value`))

  public fun deletionPolicy(): CfnDeletionPolicy? =
      unwrap(this).getDeletionPolicy()?.let(CfnDeletionPolicy::wrap)

  public fun deletionPolicy(`value`: CfnDeletionPolicy) {
    unwrap(this).setDeletionPolicy(`value`.let(CfnDeletionPolicy::unwrap))
  }

  public fun description(): String? = unwrap(this).getDescription()

  public fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public fun metadata(): Map<String, Any> = unwrap(this).getMetadata() ?: emptyMap()

  public fun metadata(`value`: Map<String, Any>) {
    unwrap(this).setMetadata(`value`)
  }

  public fun updatePolicy(): CfnUpdatePolicy? =
      unwrap(this).getUpdatePolicy()?.let(CfnUpdatePolicy::wrap)

  public fun updatePolicy(`value`: CfnUpdatePolicy) {
    unwrap(this).setUpdatePolicy(`value`.let(CfnUpdatePolicy::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e9471f918a8b2facdd7d489a0a869f9807ab48719e8be3e28eb42ffbfb14a06c")
  public fun updatePolicy(`value`: CfnUpdatePolicy.Builder.() -> Unit): Unit =
      updatePolicy(CfnUpdatePolicy(`value`))

  public fun updateReplacePolicy(): CfnDeletionPolicy? =
      unwrap(this).getUpdateReplacePolicy()?.let(CfnDeletionPolicy::wrap)

  public fun updateReplacePolicy(`value`: CfnDeletionPolicy) {
    unwrap(this).setUpdateReplacePolicy(`value`.let(CfnDeletionPolicy::unwrap))
  }

  public fun version(): String? = unwrap(this).getVersion()

  public fun version(`value`: String) {
    unwrap(this).setVersion(`value`)
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.ICfnResourceOptions,
  ) : ICfnResourceOptions {
    public override fun condition(): CfnCondition? =
        unwrap(this).getCondition()?.let(CfnCondition::wrap)

    public override fun condition(`value`: CfnCondition) {
      unwrap(this).setCondition(`value`.let(CfnCondition::unwrap))
    }

    public override fun creationPolicy(): CfnCreationPolicy? =
        unwrap(this).getCreationPolicy()?.let(CfnCreationPolicy::wrap)

    public override fun creationPolicy(`value`: CfnCreationPolicy) {
      unwrap(this).setCreationPolicy(`value`.let(CfnCreationPolicy::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9f9d917a5cde8d1fde292583205fe2e655a58f531b5b04be946bdc3c8b4e87fd")
    public override fun creationPolicy(`value`: CfnCreationPolicy.Builder.() -> Unit): Unit =
        creationPolicy(CfnCreationPolicy(`value`))

    public override fun deletionPolicy(): CfnDeletionPolicy? =
        unwrap(this).getDeletionPolicy()?.let(CfnDeletionPolicy::wrap)

    public override fun deletionPolicy(`value`: CfnDeletionPolicy) {
      unwrap(this).setDeletionPolicy(`value`.let(CfnDeletionPolicy::unwrap))
    }

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun description(`value`: String) {
      unwrap(this).setDescription(`value`)
    }

    public override fun metadata(): Map<String, Any> = unwrap(this).getMetadata() ?: emptyMap()

    public override fun metadata(`value`: Map<String, Any>) {
      unwrap(this).setMetadata(`value`)
    }

    public override fun updatePolicy(): CfnUpdatePolicy? =
        unwrap(this).getUpdatePolicy()?.let(CfnUpdatePolicy::wrap)

    public override fun updatePolicy(`value`: CfnUpdatePolicy) {
      unwrap(this).setUpdatePolicy(`value`.let(CfnUpdatePolicy::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e9471f918a8b2facdd7d489a0a869f9807ab48719e8be3e28eb42ffbfb14a06c")
    public override fun updatePolicy(`value`: CfnUpdatePolicy.Builder.() -> Unit): Unit =
        updatePolicy(CfnUpdatePolicy(`value`))

    public override fun updateReplacePolicy(): CfnDeletionPolicy? =
        unwrap(this).getUpdateReplacePolicy()?.let(CfnDeletionPolicy::wrap)

    public override fun updateReplacePolicy(`value`: CfnDeletionPolicy) {
      unwrap(this).setUpdateReplacePolicy(`value`.let(CfnDeletionPolicy::unwrap))
    }

    public override fun version(): String? = unwrap(this).getVersion()

    public override fun version(`value`: String) {
      unwrap(this).setVersion(`value`)
    }
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.ICfnResourceOptions): ICfnResourceOptions =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICfnResourceOptions): software.amazon.awscdk.ICfnResourceOptions =
        (wrapped as Wrapper).cdkObject
  }
}
