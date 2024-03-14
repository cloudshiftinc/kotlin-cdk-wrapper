package io.cloudshiftdev.awscdk.services.iotanalytics

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnPipeline internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun pipelineActivities(): Any = unwrap(this).getPipelineActivities()

  public open fun pipelineActivities(`value`: IResolvable) {
    unwrap(this).setPipelineActivities(`value`.let(IResolvable::unwrap))
  }

  public open fun pipelineActivities(__idx_ac66f0: List<Any>) {
    unwrap(this).setPipelineActivities(__idx_ac66f0)
  }

  public open fun pipelineName(): String? = unwrap(this).getPipelineName()

  public open fun pipelineName(`value`: String) {
    unwrap(this).setPipelineName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun pipelineActivities(pipelineActivities: IResolvable) {
    }

    public fun pipelineActivities(pipelineActivities: List<Any>) {
    }

    public fun pipelineName(pipelineName: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotanalytics.CfnPipeline.Builder =
        software.amazon.awscdk.services.iotanalytics.CfnPipeline.Builder.create(scope, id)

    public override fun pipelineActivities(pipelineActivities: IResolvable) {
      cdkBuilder.pipelineActivities(pipelineActivities.let(IResolvable::unwrap))
    }

    public override fun pipelineActivities(pipelineActivities: List<Any>) {
      cdkBuilder.pipelineActivities(pipelineActivities)
    }

    public override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline):
        CfnPipeline = CfnPipeline(cdkObject)

    internal fun unwrap(wrapped: CfnPipeline):
        software.amazon.awscdk.services.iotanalytics.CfnPipeline = wrapped.cdkObject
  }

  public interface ActivityProperty {
    public fun addAttributes(): Any? = unwrap(this).getAddAttributes()

    public fun channel(): Any? = unwrap(this).getChannel()

    public fun datastore(): Any? = unwrap(this).getDatastore()

    public fun deviceRegistryEnrich(): Any? = unwrap(this).getDeviceRegistryEnrich()

    public fun deviceShadowEnrich(): Any? = unwrap(this).getDeviceShadowEnrich()

    public fun filter(): Any? = unwrap(this).getFilter()

    public fun lambda(): Any? = unwrap(this).getLambda()

    public fun math(): Any? = unwrap(this).getMath()

    public fun removeAttributes(): Any? = unwrap(this).getRemoveAttributes()

    public fun selectAttributes(): Any? = unwrap(this).getSelectAttributes()

    public interface Builder {
      public fun addAttributes(addAttributes: IResolvable) {
      }

      public fun addAttributes(addAttributes: AddAttributesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ca532d9574bfdc45d025450d892c0b8d8b62aa85b803d454c5a3fabac19b356")
      public fun addAttributes(addAttributes: AddAttributesProperty.Builder.() -> Unit) {
      }

      public fun channel(channel: IResolvable) {
      }

      public fun channel(channel: ChannelProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e850e1932b80f5f992254c3d68b3782548220a1bd812c3bf494bdeac00548e8")
      public fun channel(channel: ChannelProperty.Builder.() -> Unit) {
      }

      public fun datastore(datastore: IResolvable) {
      }

      public fun datastore(datastore: DatastoreProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("269491e224203b708d5986e59ff0705f239a328198b2ceea9b94904122f8a560")
      public fun datastore(datastore: DatastoreProperty.Builder.() -> Unit) {
      }

      public fun deviceRegistryEnrich(deviceRegistryEnrich: IResolvable) {
      }

      public fun deviceRegistryEnrich(deviceRegistryEnrich: DeviceRegistryEnrichProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab22e542b2d957497953e9d0672c37ec53a0d249180ac68a5b2fc0e3e956d83a")
      public
          fun deviceRegistryEnrich(deviceRegistryEnrich: DeviceRegistryEnrichProperty.Builder.() -> Unit) {
      }

      public fun deviceShadowEnrich(deviceShadowEnrich: IResolvable) {
      }

      public fun deviceShadowEnrich(deviceShadowEnrich: DeviceShadowEnrichProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d41686fb04cacb0ea68292b59291060d7ff78c8f5b17e4b82aed6959861f72f")
      public
          fun deviceShadowEnrich(deviceShadowEnrich: DeviceShadowEnrichProperty.Builder.() -> Unit) {
      }

      public fun filter(filter: IResolvable) {
      }

      public fun filter(filter: FilterProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64cd2356ae73cd4ae7f0839ba69a5293f9ad40ef42a1261335c4f83c45d70a59")
      public fun filter(filter: FilterProperty.Builder.() -> Unit) {
      }

      public fun lambda(lambda: IResolvable) {
      }

      public fun lambda(lambda: LambdaProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("752400dbe34c10dfb329054e73dc85cd243b45e1b8551bf688df91bfdd8679f7")
      public fun lambda(lambda: LambdaProperty.Builder.() -> Unit) {
      }

      public fun math(math: IResolvable) {
      }

      public fun math(math: MathProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c6a1a86c0e9519c5c512a75d39a299706b42961487e63592617ff0e0dea4a2b")
      public fun math(math: MathProperty.Builder.() -> Unit) {
      }

      public fun removeAttributes(removeAttributes: IResolvable) {
      }

      public fun removeAttributes(removeAttributes: RemoveAttributesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12dfffc43b45420039a504fc1680bc58e9c19dd8f2a147c4d16fe29b86bd8285")
      public fun removeAttributes(removeAttributes: RemoveAttributesProperty.Builder.() -> Unit) {
      }

      public fun selectAttributes(selectAttributes: IResolvable) {
      }

      public fun selectAttributes(selectAttributes: SelectAttributesProperty) {
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("af4c5295ff31da7d5583a61d793d81b274c0fc52f577cb78d8d3be56b35f8edf")
      public fun selectAttributes(selectAttributes: SelectAttributesProperty.Builder.() -> Unit) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty.builder()

      public override fun addAttributes(addAttributes: IResolvable) {
        cdkBuilder.addAttributes(addAttributes.let(IResolvable::unwrap))
      }

      public override fun addAttributes(addAttributes: AddAttributesProperty) {
        cdkBuilder.addAttributes(addAttributes.let(AddAttributesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ca532d9574bfdc45d025450d892c0b8d8b62aa85b803d454c5a3fabac19b356")
      public override fun addAttributes(addAttributes: AddAttributesProperty.Builder.() -> Unit):
          Unit = addAttributes(AddAttributesProperty(addAttributes))

      public override fun channel(channel: IResolvable) {
        cdkBuilder.channel(channel.let(IResolvable::unwrap))
      }

      public override fun channel(channel: ChannelProperty) {
        cdkBuilder.channel(channel.let(ChannelProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e850e1932b80f5f992254c3d68b3782548220a1bd812c3bf494bdeac00548e8")
      public override fun channel(channel: ChannelProperty.Builder.() -> Unit): Unit =
          channel(ChannelProperty(channel))

      public override fun datastore(datastore: IResolvable) {
        cdkBuilder.datastore(datastore.let(IResolvable::unwrap))
      }

      public override fun datastore(datastore: DatastoreProperty) {
        cdkBuilder.datastore(datastore.let(DatastoreProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("269491e224203b708d5986e59ff0705f239a328198b2ceea9b94904122f8a560")
      public override fun datastore(datastore: DatastoreProperty.Builder.() -> Unit): Unit =
          datastore(DatastoreProperty(datastore))

      public override fun deviceRegistryEnrich(deviceRegistryEnrich: IResolvable) {
        cdkBuilder.deviceRegistryEnrich(deviceRegistryEnrich.let(IResolvable::unwrap))
      }

      public override fun deviceRegistryEnrich(deviceRegistryEnrich: DeviceRegistryEnrichProperty) {
        cdkBuilder.deviceRegistryEnrich(deviceRegistryEnrich.let(DeviceRegistryEnrichProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ab22e542b2d957497953e9d0672c37ec53a0d249180ac68a5b2fc0e3e956d83a")
      public override
          fun deviceRegistryEnrich(deviceRegistryEnrich: DeviceRegistryEnrichProperty.Builder.() -> Unit):
          Unit = deviceRegistryEnrich(DeviceRegistryEnrichProperty(deviceRegistryEnrich))

      public override fun deviceShadowEnrich(deviceShadowEnrich: IResolvable) {
        cdkBuilder.deviceShadowEnrich(deviceShadowEnrich.let(IResolvable::unwrap))
      }

      public override fun deviceShadowEnrich(deviceShadowEnrich: DeviceShadowEnrichProperty) {
        cdkBuilder.deviceShadowEnrich(deviceShadowEnrich.let(DeviceShadowEnrichProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d41686fb04cacb0ea68292b59291060d7ff78c8f5b17e4b82aed6959861f72f")
      public override
          fun deviceShadowEnrich(deviceShadowEnrich: DeviceShadowEnrichProperty.Builder.() -> Unit):
          Unit = deviceShadowEnrich(DeviceShadowEnrichProperty(deviceShadowEnrich))

      public override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable::unwrap))
      }

      public override fun filter(filter: FilterProperty) {
        cdkBuilder.filter(filter.let(FilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("64cd2356ae73cd4ae7f0839ba69a5293f9ad40ef42a1261335c4f83c45d70a59")
      public override fun filter(filter: FilterProperty.Builder.() -> Unit): Unit =
          filter(FilterProperty(filter))

      public override fun lambda(lambda: IResolvable) {
        cdkBuilder.lambda(lambda.let(IResolvable::unwrap))
      }

      public override fun lambda(lambda: LambdaProperty) {
        cdkBuilder.lambda(lambda.let(LambdaProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("752400dbe34c10dfb329054e73dc85cd243b45e1b8551bf688df91bfdd8679f7")
      public override fun lambda(lambda: LambdaProperty.Builder.() -> Unit): Unit =
          lambda(LambdaProperty(lambda))

      public override fun math(math: IResolvable) {
        cdkBuilder.math(math.let(IResolvable::unwrap))
      }

      public override fun math(math: MathProperty) {
        cdkBuilder.math(math.let(MathProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c6a1a86c0e9519c5c512a75d39a299706b42961487e63592617ff0e0dea4a2b")
      public override fun math(math: MathProperty.Builder.() -> Unit): Unit =
          math(MathProperty(math))

      public override fun removeAttributes(removeAttributes: IResolvable) {
        cdkBuilder.removeAttributes(removeAttributes.let(IResolvable::unwrap))
      }

      public override fun removeAttributes(removeAttributes: RemoveAttributesProperty) {
        cdkBuilder.removeAttributes(removeAttributes.let(RemoveAttributesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("12dfffc43b45420039a504fc1680bc58e9c19dd8f2a147c4d16fe29b86bd8285")
      public override
          fun removeAttributes(removeAttributes: RemoveAttributesProperty.Builder.() -> Unit): Unit
          = removeAttributes(RemoveAttributesProperty(removeAttributes))

      public override fun selectAttributes(selectAttributes: IResolvable) {
        cdkBuilder.selectAttributes(selectAttributes.let(IResolvable::unwrap))
      }

      public override fun selectAttributes(selectAttributes: SelectAttributesProperty) {
        cdkBuilder.selectAttributes(selectAttributes.let(SelectAttributesProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("af4c5295ff31da7d5583a61d793d81b274c0fc52f577cb78d8d3be56b35f8edf")
      public override
          fun selectAttributes(selectAttributes: SelectAttributesProperty.Builder.() -> Unit): Unit
          = selectAttributes(SelectAttributesProperty(selectAttributes))

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty,
    ) : ActivityProperty {
      public override fun addAttributes(): Any? = unwrap(this).getAddAttributes()

      public override fun channel(): Any? = unwrap(this).getChannel()

      public override fun datastore(): Any? = unwrap(this).getDatastore()

      public override fun deviceRegistryEnrich(): Any? = unwrap(this).getDeviceRegistryEnrich()

      public override fun deviceShadowEnrich(): Any? = unwrap(this).getDeviceShadowEnrich()

      public override fun filter(): Any? = unwrap(this).getFilter()

      public override fun lambda(): Any? = unwrap(this).getLambda()

      public override fun math(): Any? = unwrap(this).getMath()

      public override fun removeAttributes(): Any? = unwrap(this).getRemoveAttributes()

      public override fun selectAttributes(): Any? = unwrap(this).getSelectAttributes()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActivityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty):
          ActivityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActivityProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ActivityProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DatastoreProperty {
    public fun datastoreName(): String

    public fun name(): String

    public interface Builder {
      public fun datastoreName(datastoreName: String) {
      }

      public fun name(name: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty.builder()

      public override fun datastoreName(datastoreName: String) {
        cdkBuilder.datastoreName(datastoreName)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty,
    ) : DatastoreProperty {
      public override fun datastoreName(): String = unwrap(this).getDatastoreName()

      public override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatastoreProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty):
          DatastoreProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatastoreProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DatastoreProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface AddAttributesProperty {
    public fun attributes(): Any

    public fun name(): String

    public fun next(): String? = unwrap(this).getNext()

    public interface Builder {
      public fun attributes(attributes: IResolvable) {
      }

      public fun attributes(attributes: Map<String, String>) {
      }

      public fun name(name: String) {
      }

      public fun next(next: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty.builder()

      public override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      public override fun attributes(attributes: Map<String, String>) {
        cdkBuilder.attributes(attributes)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty,
    ) : AddAttributesProperty {
      public override fun attributes(): Any = unwrap(this).getAttributes()

      public override fun name(): String = unwrap(this).getName()

      public override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AddAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty):
          AddAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AddAttributesProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.AddAttributesProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface FilterProperty {
    public fun filter(): String

    public fun name(): String

    public fun next(): String? = unwrap(this).getNext()

    public interface Builder {
      public fun filter(filter: String) {
      }

      public fun name(name: String) {
      }

      public fun next(next: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty.builder()

      public override fun filter(filter: String) {
        cdkBuilder.filter(filter)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty,
    ) : FilterProperty {
      public override fun filter(): String = unwrap(this).getFilter()

      public override fun name(): String = unwrap(this).getName()

      public override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty):
          FilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.FilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface LambdaProperty {
    public fun batchSize(): Number

    public fun lambdaName(): String

    public fun name(): String

    public fun next(): String? = unwrap(this).getNext()

    public interface Builder {
      public fun batchSize(batchSize: Number) {
      }

      public fun lambdaName(lambdaName: String) {
      }

      public fun name(name: String) {
      }

      public fun next(next: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty.builder()

      public override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      public override fun lambdaName(lambdaName: String) {
        cdkBuilder.lambdaName(lambdaName)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty,
    ) : LambdaProperty {
      public override fun batchSize(): Number = unwrap(this).getBatchSize()

      public override fun lambdaName(): String = unwrap(this).getLambdaName()

      public override fun name(): String = unwrap(this).getName()

      public override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): LambdaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty):
          LambdaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LambdaProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.LambdaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DeviceShadowEnrichProperty {
    public fun attribute(): String

    public fun name(): String

    public fun next(): String? = unwrap(this).getNext()

    public fun roleArn(): String

    public fun thingName(): String

    public interface Builder {
      public fun attribute(attribute: String) {
      }

      public fun name(name: String) {
      }

      public fun next(next: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun thingName(thingName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty.builder()

      public override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun thingName(thingName: String) {
        cdkBuilder.thingName(thingName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty,
    ) : DeviceShadowEnrichProperty {
      public override fun attribute(): String = unwrap(this).getAttribute()

      public override fun name(): String = unwrap(this).getName()

      public override fun next(): String? = unwrap(this).getNext()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun thingName(): String = unwrap(this).getThingName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceShadowEnrichProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty):
          DeviceShadowEnrichProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceShadowEnrichProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceShadowEnrichProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SelectAttributesProperty {
    public fun attributes(): List<String>

    public fun name(): String

    public fun next(): String? = unwrap(this).getNext()

    public interface Builder {
      public fun attributes(attributes: List<String>) {
      }

      public fun name(name: String) {
      }

      public fun next(next: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty.builder()

      public override fun attributes(attributes: List<String>) {
        cdkBuilder.attributes(attributes)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty,
    ) : SelectAttributesProperty {
      public override fun attributes(): List<String> = unwrap(this).getAttributes() ?: emptyList()

      public override fun name(): String = unwrap(this).getName()

      public override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SelectAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty):
          SelectAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SelectAttributesProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.SelectAttributesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RemoveAttributesProperty {
    public fun attributes(): List<String>

    public fun name(): String

    public fun next(): String? = unwrap(this).getNext()

    public interface Builder {
      public fun attributes(attributes: List<String>) {
      }

      public fun name(name: String) {
      }

      public fun next(next: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty.builder()

      public override fun attributes(attributes: List<String>) {
        cdkBuilder.attributes(attributes)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty,
    ) : RemoveAttributesProperty {
      public override fun attributes(): List<String> = unwrap(this).getAttributes() ?: emptyList()

      public override fun name(): String = unwrap(this).getName()

      public override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RemoveAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty):
          RemoveAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RemoveAttributesProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.RemoveAttributesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MathProperty {
    public fun attribute(): String

    public fun math(): String

    public fun name(): String

    public fun next(): String? = unwrap(this).getNext()

    public interface Builder {
      public fun attribute(attribute: String) {
      }

      public fun math(math: String) {
      }

      public fun name(name: String) {
      }

      public fun next(next: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty.builder()

      public override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public override fun math(math: String) {
        cdkBuilder.math(math)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty,
    ) : MathProperty {
      public override fun attribute(): String = unwrap(this).getAttribute()

      public override fun math(): String = unwrap(this).getMath()

      public override fun name(): String = unwrap(this).getName()

      public override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MathProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty):
          MathProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MathProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.MathProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ChannelProperty {
    public fun channelName(): String

    public fun name(): String

    public fun next(): String? = unwrap(this).getNext()

    public interface Builder {
      public fun channelName(channelName: String) {
      }

      public fun name(name: String) {
      }

      public fun next(next: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.Builder =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty.builder()

      public override fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public fun build(): software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty,
    ) : ChannelProperty {
      public override fun channelName(): String = unwrap(this).getChannelName()

      public override fun name(): String = unwrap(this).getName()

      public override fun next(): String? = unwrap(this).getNext()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ChannelProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty):
          ChannelProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ChannelProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.ChannelProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DeviceRegistryEnrichProperty {
    public fun attribute(): String

    public fun name(): String

    public fun next(): String? = unwrap(this).getNext()

    public fun roleArn(): String

    public fun thingName(): String

    public interface Builder {
      public fun attribute(attribute: String) {
      }

      public fun name(name: String) {
      }

      public fun next(next: String) {
      }

      public fun roleArn(roleArn: String) {
      }

      public fun thingName(thingName: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.Builder
          =
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty.builder()

      public override fun attribute(attribute: String) {
        cdkBuilder.attribute(attribute)
      }

      public override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public override fun next(next: String) {
        cdkBuilder.next(next)
      }

      public override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public override fun thingName(thingName: String) {
        cdkBuilder.thingName(thingName)
      }

      public fun build():
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty,
    ) : DeviceRegistryEnrichProperty {
      public override fun attribute(): String = unwrap(this).getAttribute()

      public override fun name(): String = unwrap(this).getName()

      public override fun next(): String? = unwrap(this).getNext()

      public override fun roleArn(): String = unwrap(this).getRoleArn()

      public override fun thingName(): String = unwrap(this).getThingName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DeviceRegistryEnrichProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty):
          DeviceRegistryEnrichProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DeviceRegistryEnrichProperty):
          software.amazon.awscdk.services.iotanalytics.CfnPipeline.DeviceRegistryEnrichProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
