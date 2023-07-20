@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.omics

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnAnnotationStore
import software.amazon.awscdk.services.omics.CfnAnnotationStoreProps
import software.amazon.awscdk.services.omics.CfnReferenceStore
import software.amazon.awscdk.services.omics.CfnReferenceStoreProps
import software.amazon.awscdk.services.omics.CfnRunGroup
import software.amazon.awscdk.services.omics.CfnRunGroupProps
import software.amazon.awscdk.services.omics.CfnSequenceStore
import software.amazon.awscdk.services.omics.CfnSequenceStoreProps
import software.amazon.awscdk.services.omics.CfnVariantStore
import software.amazon.awscdk.services.omics.CfnVariantStoreProps
import software.amazon.awscdk.services.omics.CfnWorkflow
import software.amazon.awscdk.services.omics.CfnWorkflowProps
import software.constructs.Construct

public object omics {
  public inline fun cfnAnnotationStore(
    scope: Construct,
    id: String,
    block: CfnAnnotationStoreDsl.() -> Unit = {},
  ): CfnAnnotationStore {
    val builder = CfnAnnotationStoreDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnAnnotationStoreProps(block: CfnAnnotationStorePropsDsl.() -> Unit = {}):
      CfnAnnotationStoreProps {
    val builder = CfnAnnotationStorePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnnotationStoreReferenceItemProperty(block: CfnAnnotationStoreReferenceItemPropertyDsl.() -> Unit
      = {}): CfnAnnotationStore.ReferenceItemProperty {
    val builder = CfnAnnotationStoreReferenceItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnnotationStoreSseConfigProperty(block: CfnAnnotationStoreSseConfigPropertyDsl.() -> Unit
      = {}): CfnAnnotationStore.SseConfigProperty {
    val builder = CfnAnnotationStoreSseConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnnotationStoreStoreOptionsProperty(block: CfnAnnotationStoreStoreOptionsPropertyDsl.() -> Unit
      = {}): CfnAnnotationStore.StoreOptionsProperty {
    val builder = CfnAnnotationStoreStoreOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnAnnotationStoreTsvStoreOptionsProperty(block: CfnAnnotationStoreTsvStoreOptionsPropertyDsl.() -> Unit
      = {}): CfnAnnotationStore.TsvStoreOptionsProperty {
    val builder = CfnAnnotationStoreTsvStoreOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReferenceStore(
    scope: Construct,
    id: String,
    block: CfnReferenceStoreDsl.() -> Unit = {},
  ): CfnReferenceStore {
    val builder = CfnReferenceStoreDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnReferenceStoreProps(block: CfnReferenceStorePropsDsl.() -> Unit = {}):
      CfnReferenceStoreProps {
    val builder = CfnReferenceStorePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnReferenceStoreSseConfigProperty(block: CfnReferenceStoreSseConfigPropertyDsl.() -> Unit
      = {}): CfnReferenceStore.SseConfigProperty {
    val builder = CfnReferenceStoreSseConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRunGroup(
    scope: Construct,
    id: String,
    block: CfnRunGroupDsl.() -> Unit = {},
  ): CfnRunGroup {
    val builder = CfnRunGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnRunGroupProps(block: CfnRunGroupPropsDsl.() -> Unit = {}): CfnRunGroupProps {
    val builder = CfnRunGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSequenceStore(
    scope: Construct,
    id: String,
    block: CfnSequenceStoreDsl.() -> Unit = {},
  ): CfnSequenceStore {
    val builder = CfnSequenceStoreDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnSequenceStoreProps(block: CfnSequenceStorePropsDsl.() -> Unit = {}):
      CfnSequenceStoreProps {
    val builder = CfnSequenceStorePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnSequenceStoreSseConfigProperty(block: CfnSequenceStoreSseConfigPropertyDsl.() -> Unit =
      {}): CfnSequenceStore.SseConfigProperty {
    val builder = CfnSequenceStoreSseConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVariantStore(
    scope: Construct,
    id: String,
    block: CfnVariantStoreDsl.() -> Unit = {},
  ): CfnVariantStore {
    val builder = CfnVariantStoreDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnVariantStoreProps(block: CfnVariantStorePropsDsl.() -> Unit = {}):
      CfnVariantStoreProps {
    val builder = CfnVariantStorePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVariantStoreReferenceItemProperty(block: CfnVariantStoreReferenceItemPropertyDsl.() -> Unit
      = {}): CfnVariantStore.ReferenceItemProperty {
    val builder = CfnVariantStoreReferenceItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnVariantStoreSseConfigProperty(block: CfnVariantStoreSseConfigPropertyDsl.() -> Unit =
      {}): CfnVariantStore.SseConfigProperty {
    val builder = CfnVariantStoreSseConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWorkflow(
    scope: Construct,
    id: String,
    block: CfnWorkflowDsl.() -> Unit = {},
  ): CfnWorkflow {
    val builder = CfnWorkflowDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  public inline fun cfnWorkflowProps(block: CfnWorkflowPropsDsl.() -> Unit = {}): CfnWorkflowProps {
    val builder = CfnWorkflowPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  public inline
      fun cfnWorkflowWorkflowParameterProperty(block: CfnWorkflowWorkflowParameterPropertyDsl.() -> Unit
      = {}): CfnWorkflow.WorkflowParameterProperty {
    val builder = CfnWorkflowWorkflowParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
