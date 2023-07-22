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
  /**
   * Creates an annotation store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * Object schema;
   * CfnAnnotationStore cfnAnnotationStore = CfnAnnotationStore.Builder.create(this,
   * "MyCfnAnnotationStore")
   * .name("name")
   * .storeFormat("storeFormat")
   * // the properties below are optional
   * .description("description")
   * .reference(ReferenceItemProperty.builder()
   * .referenceArn("referenceArn")
   * .build())
   * .sseConfig(SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build())
   * .storeOptions(StoreOptionsProperty.builder()
   * .tsvStoreOptions(TsvStoreOptionsProperty.builder()
   * .annotationType("annotationType")
   * .formatToHeader(Map.of(
   * "formatToHeaderKey", "formatToHeader"))
   * .schema(schema)
   * .build())
   * .build())
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html)
   */
  public inline fun cfnAnnotationStore(
    scope: Construct,
    id: String,
    block: CfnAnnotationStoreDsl.() -> Unit = {},
  ): CfnAnnotationStore {
    val builder = CfnAnnotationStoreDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnAnnotationStore`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * Object schema;
   * CfnAnnotationStoreProps cfnAnnotationStoreProps = CfnAnnotationStoreProps.builder()
   * .name("name")
   * .storeFormat("storeFormat")
   * // the properties below are optional
   * .description("description")
   * .reference(ReferenceItemProperty.builder()
   * .referenceArn("referenceArn")
   * .build())
   * .sseConfig(SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build())
   * .storeOptions(StoreOptionsProperty.builder()
   * .tsvStoreOptions(TsvStoreOptionsProperty.builder()
   * .annotationType("annotationType")
   * .formatToHeader(Map.of(
   * "formatToHeaderKey", "formatToHeader"))
   * .schema(schema)
   * .build())
   * .build())
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-annotationstore.html)
   */
  public inline fun cfnAnnotationStoreProps(block: CfnAnnotationStorePropsDsl.() -> Unit = {}):
      CfnAnnotationStoreProps {
    val builder = CfnAnnotationStorePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A genome reference.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * ReferenceItemProperty referenceItemProperty = ReferenceItemProperty.builder()
   * .referenceArn("referenceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-referenceitem.html)
   */
  public inline
      fun cfnAnnotationStoreReferenceItemProperty(block: CfnAnnotationStoreReferenceItemPropertyDsl.() -> Unit
      = {}): CfnAnnotationStore.ReferenceItemProperty {
    val builder = CfnAnnotationStoreReferenceItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Server-side encryption (SSE) settings for a store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * SseConfigProperty sseConfigProperty = SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-sseconfig.html)
   */
  public inline
      fun cfnAnnotationStoreSseConfigProperty(block: CfnAnnotationStoreSseConfigPropertyDsl.() -> Unit
      = {}): CfnAnnotationStore.SseConfigProperty {
    val builder = CfnAnnotationStoreSseConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The store's file parsing options.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * Object schema;
   * StoreOptionsProperty storeOptionsProperty = StoreOptionsProperty.builder()
   * .tsvStoreOptions(TsvStoreOptionsProperty.builder()
   * .annotationType("annotationType")
   * .formatToHeader(Map.of(
   * "formatToHeaderKey", "formatToHeader"))
   * .schema(schema)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-storeoptions.html)
   */
  public inline
      fun cfnAnnotationStoreStoreOptionsProperty(block: CfnAnnotationStoreStoreOptionsPropertyDsl.() -> Unit
      = {}): CfnAnnotationStore.StoreOptionsProperty {
    val builder = CfnAnnotationStoreStoreOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The store's parsing options.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * Object schema;
   * TsvStoreOptionsProperty tsvStoreOptionsProperty = TsvStoreOptionsProperty.builder()
   * .annotationType("annotationType")
   * .formatToHeader(Map.of(
   * "formatToHeaderKey", "formatToHeader"))
   * .schema(schema)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-annotationstore-tsvstoreoptions.html)
   */
  public inline
      fun cfnAnnotationStoreTsvStoreOptionsProperty(block: CfnAnnotationStoreTsvStoreOptionsPropertyDsl.() -> Unit
      = {}): CfnAnnotationStore.TsvStoreOptionsProperty {
    val builder = CfnAnnotationStoreTsvStoreOptionsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a reference store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * CfnReferenceStore cfnReferenceStore = CfnReferenceStore.Builder.create(this,
   * "MyCfnReferenceStore")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .sseConfig(SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build())
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html)
   */
  public inline fun cfnReferenceStore(
    scope: Construct,
    id: String,
    block: CfnReferenceStoreDsl.() -> Unit = {},
  ): CfnReferenceStore {
    val builder = CfnReferenceStoreDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnReferenceStore`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * CfnReferenceStoreProps cfnReferenceStoreProps = CfnReferenceStoreProps.builder()
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .sseConfig(SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build())
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-referencestore.html)
   */
  public inline fun cfnReferenceStoreProps(block: CfnReferenceStorePropsDsl.() -> Unit = {}):
      CfnReferenceStoreProps {
    val builder = CfnReferenceStorePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Server-side encryption (SSE) settings for a store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * SseConfigProperty sseConfigProperty = SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-referencestore-sseconfig.html)
   */
  public inline
      fun cfnReferenceStoreSseConfigProperty(block: CfnReferenceStoreSseConfigPropertyDsl.() -> Unit
      = {}): CfnReferenceStore.SseConfigProperty {
    val builder = CfnReferenceStoreSseConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a run group.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * CfnRunGroup cfnRunGroup = CfnRunGroup.Builder.create(this, "MyCfnRunGroup")
   * .maxCpus(123)
   * .maxDuration(123)
   * .maxRuns(123)
   * .name("name")
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html)
   */
  public inline fun cfnRunGroup(
    scope: Construct,
    id: String,
    block: CfnRunGroupDsl.() -> Unit = {},
  ): CfnRunGroup {
    val builder = CfnRunGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnRunGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * CfnRunGroupProps cfnRunGroupProps = CfnRunGroupProps.builder()
   * .maxCpus(123)
   * .maxDuration(123)
   * .maxRuns(123)
   * .name("name")
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-rungroup.html)
   */
  public inline fun cfnRunGroupProps(block: CfnRunGroupPropsDsl.() -> Unit = {}): CfnRunGroupProps {
    val builder = CfnRunGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a sequence store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * CfnSequenceStore cfnSequenceStore = CfnSequenceStore.Builder.create(this, "MyCfnSequenceStore")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .fallbackLocation("fallbackLocation")
   * .sseConfig(SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build())
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html)
   */
  public inline fun cfnSequenceStore(
    scope: Construct,
    id: String,
    block: CfnSequenceStoreDsl.() -> Unit = {},
  ): CfnSequenceStore {
    val builder = CfnSequenceStoreDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnSequenceStore`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * CfnSequenceStoreProps cfnSequenceStoreProps = CfnSequenceStoreProps.builder()
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .fallbackLocation("fallbackLocation")
   * .sseConfig(SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build())
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-sequencestore.html)
   */
  public inline fun cfnSequenceStoreProps(block: CfnSequenceStorePropsDsl.() -> Unit = {}):
      CfnSequenceStoreProps {
    val builder = CfnSequenceStorePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Server-side encryption (SSE) settings for a store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * SseConfigProperty sseConfigProperty = SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-sequencestore-sseconfig.html)
   */
  public inline
      fun cfnSequenceStoreSseConfigProperty(block: CfnSequenceStoreSseConfigPropertyDsl.() -> Unit =
      {}): CfnSequenceStore.SseConfigProperty {
    val builder = CfnSequenceStoreSseConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Create a store for variant data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * CfnVariantStore cfnVariantStore = CfnVariantStore.Builder.create(this, "MyCfnVariantStore")
   * .name("name")
   * .reference(ReferenceItemProperty.builder()
   * .referenceArn("referenceArn")
   * .build())
   * // the properties below are optional
   * .description("description")
   * .sseConfig(SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build())
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html)
   */
  public inline fun cfnVariantStore(
    scope: Construct,
    id: String,
    block: CfnVariantStoreDsl.() -> Unit = {},
  ): CfnVariantStore {
    val builder = CfnVariantStoreDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnVariantStore`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * CfnVariantStoreProps cfnVariantStoreProps = CfnVariantStoreProps.builder()
   * .name("name")
   * .reference(ReferenceItemProperty.builder()
   * .referenceArn("referenceArn")
   * .build())
   * // the properties below are optional
   * .description("description")
   * .sseConfig(SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build())
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-variantstore.html)
   */
  public inline fun cfnVariantStoreProps(block: CfnVariantStorePropsDsl.() -> Unit = {}):
      CfnVariantStoreProps {
    val builder = CfnVariantStorePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The read set's genome reference ARN.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * ReferenceItemProperty referenceItemProperty = ReferenceItemProperty.builder()
   * .referenceArn("referenceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-variantstore-referenceitem.html)
   */
  public inline
      fun cfnVariantStoreReferenceItemProperty(block: CfnVariantStoreReferenceItemPropertyDsl.() -> Unit
      = {}): CfnVariantStore.ReferenceItemProperty {
    val builder = CfnVariantStoreReferenceItemPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Server-side encryption (SSE) settings for a store.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * SseConfigProperty sseConfigProperty = SseConfigProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .keyArn("keyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-variantstore-sseconfig.html)
   */
  public inline
      fun cfnVariantStoreSseConfigProperty(block: CfnVariantStoreSseConfigPropertyDsl.() -> Unit =
      {}): CfnVariantStore.SseConfigProperty {
    val builder = CfnVariantStoreSseConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a workflow.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * CfnWorkflow cfnWorkflow = CfnWorkflow.Builder.create(this, "MyCfnWorkflow")
   * .definitionUri("definitionUri")
   * .description("description")
   * .engine("engine")
   * .main("main")
   * .name("name")
   * .parameterTemplate(Map.of(
   * "parameterTemplateKey", WorkflowParameterProperty.builder()
   * .description("description")
   * .optional(false)
   * .build()))
   * .storageCapacity(123)
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html)
   */
  public inline fun cfnWorkflow(
    scope: Construct,
    id: String,
    block: CfnWorkflowDsl.() -> Unit = {},
  ): CfnWorkflow {
    val builder = CfnWorkflowDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnWorkflow`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * CfnWorkflowProps cfnWorkflowProps = CfnWorkflowProps.builder()
   * .definitionUri("definitionUri")
   * .description("description")
   * .engine("engine")
   * .main("main")
   * .name("name")
   * .parameterTemplate(Map.of(
   * "parameterTemplateKey", WorkflowParameterProperty.builder()
   * .description("description")
   * .optional(false)
   * .build()))
   * .storageCapacity(123)
   * .tags(Map.of(
   * "tagsKey", "tags"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-omics-workflow.html)
   */
  public inline fun cfnWorkflowProps(block: CfnWorkflowPropsDsl.() -> Unit = {}): CfnWorkflowProps {
    val builder = CfnWorkflowPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * A workflow parameter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.omics.*;
   * WorkflowParameterProperty workflowParameterProperty = WorkflowParameterProperty.builder()
   * .description("description")
   * .optional(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-omics-workflow-workflowparameter.html)
   */
  public inline
      fun cfnWorkflowWorkflowParameterProperty(block: CfnWorkflowWorkflowParameterPropertyDsl.() -> Unit
      = {}): CfnWorkflow.WorkflowParameterProperty {
    val builder = CfnWorkflowWorkflowParameterPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
