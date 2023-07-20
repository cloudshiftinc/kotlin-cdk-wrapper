@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnAnnotationStore
import software.amazon.awscdk.services.omics.CfnReferenceStore
import software.amazon.awscdk.services.omics.CfnSequenceStore
import software.amazon.awscdk.services.omics.CfnVariantStore

public inline
    fun CfnReferenceStore.setSseConfig(block: CfnReferenceStoreSseConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnReferenceStoreSseConfigPropertyDsl()
  builder.apply(block)
  return setSseConfig(builder.build())
}

public inline
    fun CfnSequenceStore.setSseConfig(block: CfnSequenceStoreSseConfigPropertyDsl.() -> Unit = {}) {
  val builder = CfnSequenceStoreSseConfigPropertyDsl()
  builder.apply(block)
  return setSseConfig(builder.build())
}

public inline
    fun CfnVariantStore.setReference(block: CfnVariantStoreReferenceItemPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnVariantStoreReferenceItemPropertyDsl()
  builder.apply(block)
  return setReference(builder.build())
}

public inline fun CfnVariantStore.setSseConfig(block: CfnVariantStoreSseConfigPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnVariantStoreSseConfigPropertyDsl()
  builder.apply(block)
  return setSseConfig(builder.build())
}

public inline
    fun CfnAnnotationStore.setReference(block: CfnAnnotationStoreReferenceItemPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAnnotationStoreReferenceItemPropertyDsl()
  builder.apply(block)
  return setReference(builder.build())
}

public inline
    fun CfnAnnotationStore.setSseConfig(block: CfnAnnotationStoreSseConfigPropertyDsl.() -> Unit =
    {}) {
  val builder = CfnAnnotationStoreSseConfigPropertyDsl()
  builder.apply(block)
  return setSseConfig(builder.build())
}

public inline
    fun CfnAnnotationStore.setStoreOptions(block: CfnAnnotationStoreStoreOptionsPropertyDsl.() -> Unit
    = {}) {
  val builder = CfnAnnotationStoreStoreOptionsPropertyDsl()
  builder.apply(block)
  return setStoreOptions(builder.build())
}
