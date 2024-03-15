@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnJobProps {
  public fun dataCatalogOutputs(): Any? = unwrap(this).getDataCatalogOutputs()

  public fun databaseOutputs(): Any? = unwrap(this).getDatabaseOutputs()

  public fun datasetName(): String? = unwrap(this).getDatasetName()

  public fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

  public fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

  public fun jobSample(): Any? = unwrap(this).getJobSample()

  public fun logSubscription(): String? = unwrap(this).getLogSubscription()

  public fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

  public fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  public fun name(): String

  public fun outputLocation(): Any? = unwrap(this).getOutputLocation()

  public fun outputs(): Any? = unwrap(this).getOutputs()

  public fun profileConfiguration(): Any? = unwrap(this).getProfileConfiguration()

  public fun projectName(): String? = unwrap(this).getProjectName()

  public fun recipe(): Any? = unwrap(this).getRecipe()

  public fun roleArn(): String

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun timeout(): Number? = unwrap(this).getTimeout()

  public fun type(): String

  public fun validationConfigurations(): Any? = unwrap(this).getValidationConfigurations()

  @CdkDslMarker
  public interface Builder {
    public fun dataCatalogOutputs(dataCatalogOutputs: IResolvable)

    public fun dataCatalogOutputs(dataCatalogOutputs: List<Any>)

    public fun dataCatalogOutputs(vararg dataCatalogOutputs: Any)

    public fun databaseOutputs(databaseOutputs: IResolvable)

    public fun databaseOutputs(databaseOutputs: List<Any>)

    public fun databaseOutputs(vararg databaseOutputs: Any)

    public fun datasetName(datasetName: String)

    public fun encryptionKeyArn(encryptionKeyArn: String)

    public fun encryptionMode(encryptionMode: String)

    public fun jobSample(jobSample: IResolvable)

    public fun jobSample(jobSample: CfnJob.JobSampleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb2dc01320ade4b6c74e4110f765b2f7580dead6c23cd512e358c81fa84cb30f")
    public fun jobSample(jobSample: CfnJob.JobSampleProperty.Builder.() -> Unit)

    public fun logSubscription(logSubscription: String)

    public fun maxCapacity(maxCapacity: Number)

    public fun maxRetries(maxRetries: Number)

    public fun name(name: String)

    public fun outputLocation(outputLocation: IResolvable)

    public fun outputLocation(outputLocation: CfnJob.OutputLocationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df087322aa766b42aa701e0036bae9f7676f6889f2d8569f4285399c6547e537")
    public fun outputLocation(outputLocation: CfnJob.OutputLocationProperty.Builder.() -> Unit)

    public fun outputs(outputs: IResolvable)

    public fun outputs(outputs: List<Any>)

    public fun outputs(vararg outputs: Any)

    public fun profileConfiguration(profileConfiguration: IResolvable)

    public fun profileConfiguration(profileConfiguration: CfnJob.ProfileConfigurationProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("335717258b03c27bd4865c484d038e2c5bda2ca4ca6a135fdca92216095e1e5e")
    public
        fun profileConfiguration(profileConfiguration: CfnJob.ProfileConfigurationProperty.Builder.() -> Unit)

    public fun projectName(projectName: String)

    public fun recipe(recipe: IResolvable)

    public fun recipe(recipe: CfnJob.RecipeProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("137fa23d86816e19b72673bd9db975fdc5048b0a74c828cd2693f3c570049c95")
    public fun recipe(recipe: CfnJob.RecipeProperty.Builder.() -> Unit)

    public fun roleArn(roleArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun timeout(timeout: Number)

    public fun type(type: String)

    public fun validationConfigurations(validationConfigurations: IResolvable)

    public fun validationConfigurations(validationConfigurations: List<Any>)

    public fun validationConfigurations(vararg validationConfigurations: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnJobProps.Builder =
        software.amazon.awscdk.services.databrew.CfnJobProps.builder()

    override fun dataCatalogOutputs(dataCatalogOutputs: IResolvable) {
      cdkBuilder.dataCatalogOutputs(dataCatalogOutputs.let(IResolvable::unwrap))
    }

    override fun dataCatalogOutputs(dataCatalogOutputs: List<Any>) {
      cdkBuilder.dataCatalogOutputs(dataCatalogOutputs)
    }

    override fun dataCatalogOutputs(vararg dataCatalogOutputs: Any): Unit =
        dataCatalogOutputs(dataCatalogOutputs.toList())

    override fun databaseOutputs(databaseOutputs: IResolvable) {
      cdkBuilder.databaseOutputs(databaseOutputs.let(IResolvable::unwrap))
    }

    override fun databaseOutputs(databaseOutputs: List<Any>) {
      cdkBuilder.databaseOutputs(databaseOutputs)
    }

    override fun databaseOutputs(vararg databaseOutputs: Any): Unit =
        databaseOutputs(databaseOutputs.toList())

    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    override fun encryptionKeyArn(encryptionKeyArn: String) {
      cdkBuilder.encryptionKeyArn(encryptionKeyArn)
    }

    override fun encryptionMode(encryptionMode: String) {
      cdkBuilder.encryptionMode(encryptionMode)
    }

    override fun jobSample(jobSample: IResolvable) {
      cdkBuilder.jobSample(jobSample.let(IResolvable::unwrap))
    }

    override fun jobSample(jobSample: CfnJob.JobSampleProperty) {
      cdkBuilder.jobSample(jobSample.let(CfnJob.JobSampleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb2dc01320ade4b6c74e4110f765b2f7580dead6c23cd512e358c81fa84cb30f")
    override fun jobSample(jobSample: CfnJob.JobSampleProperty.Builder.() -> Unit): Unit =
        jobSample(CfnJob.JobSampleProperty(jobSample))

    override fun logSubscription(logSubscription: String) {
      cdkBuilder.logSubscription(logSubscription)
    }

    override fun maxCapacity(maxCapacity: Number) {
      cdkBuilder.maxCapacity(maxCapacity)
    }

    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outputLocation(outputLocation: IResolvable) {
      cdkBuilder.outputLocation(outputLocation.let(IResolvable::unwrap))
    }

    override fun outputLocation(outputLocation: CfnJob.OutputLocationProperty) {
      cdkBuilder.outputLocation(outputLocation.let(CfnJob.OutputLocationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df087322aa766b42aa701e0036bae9f7676f6889f2d8569f4285399c6547e537")
    override fun outputLocation(outputLocation: CfnJob.OutputLocationProperty.Builder.() -> Unit):
        Unit = outputLocation(CfnJob.OutputLocationProperty(outputLocation))

    override fun outputs(outputs: IResolvable) {
      cdkBuilder.outputs(outputs.let(IResolvable::unwrap))
    }

    override fun outputs(outputs: List<Any>) {
      cdkBuilder.outputs(outputs)
    }

    override fun outputs(vararg outputs: Any): Unit = outputs(outputs.toList())

    override fun profileConfiguration(profileConfiguration: IResolvable) {
      cdkBuilder.profileConfiguration(profileConfiguration.let(IResolvable::unwrap))
    }

    override fun profileConfiguration(profileConfiguration: CfnJob.ProfileConfigurationProperty) {
      cdkBuilder.profileConfiguration(profileConfiguration.let(CfnJob.ProfileConfigurationProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("335717258b03c27bd4865c484d038e2c5bda2ca4ca6a135fdca92216095e1e5e")
    override
        fun profileConfiguration(profileConfiguration: CfnJob.ProfileConfigurationProperty.Builder.() -> Unit):
        Unit = profileConfiguration(CfnJob.ProfileConfigurationProperty(profileConfiguration))

    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    override fun recipe(recipe: IResolvable) {
      cdkBuilder.recipe(recipe.let(IResolvable::unwrap))
    }

    override fun recipe(recipe: CfnJob.RecipeProperty) {
      cdkBuilder.recipe(recipe.let(CfnJob.RecipeProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("137fa23d86816e19b72673bd9db975fdc5048b0a74c828cd2693f3c570049c95")
    override fun recipe(recipe: CfnJob.RecipeProperty.Builder.() -> Unit): Unit =
        recipe(CfnJob.RecipeProperty(recipe))

    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun timeout(timeout: Number) {
      cdkBuilder.timeout(timeout)
    }

    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    override fun validationConfigurations(validationConfigurations: IResolvable) {
      cdkBuilder.validationConfigurations(validationConfigurations.let(IResolvable::unwrap))
    }

    override fun validationConfigurations(validationConfigurations: List<Any>) {
      cdkBuilder.validationConfigurations(validationConfigurations)
    }

    override fun validationConfigurations(vararg validationConfigurations: Any): Unit =
        validationConfigurations(validationConfigurations.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnJobProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.databrew.CfnJobProps,
  ) : CdkObject(cdkObject), CfnJobProps {
    override fun dataCatalogOutputs(): Any? = unwrap(this).getDataCatalogOutputs()

    override fun databaseOutputs(): Any? = unwrap(this).getDatabaseOutputs()

    override fun datasetName(): String? = unwrap(this).getDatasetName()

    override fun encryptionKeyArn(): String? = unwrap(this).getEncryptionKeyArn()

    override fun encryptionMode(): String? = unwrap(this).getEncryptionMode()

    override fun jobSample(): Any? = unwrap(this).getJobSample()

    override fun logSubscription(): String? = unwrap(this).getLogSubscription()

    override fun maxCapacity(): Number? = unwrap(this).getMaxCapacity()

    override fun maxRetries(): Number? = unwrap(this).getMaxRetries()

    override fun name(): String = unwrap(this).getName()

    override fun outputLocation(): Any? = unwrap(this).getOutputLocation()

    override fun outputs(): Any? = unwrap(this).getOutputs()

    override fun profileConfiguration(): Any? = unwrap(this).getProfileConfiguration()

    override fun projectName(): String? = unwrap(this).getProjectName()

    override fun recipe(): Any? = unwrap(this).getRecipe()

    override fun roleArn(): String = unwrap(this).getRoleArn()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun timeout(): Number? = unwrap(this).getTimeout()

    override fun type(): String = unwrap(this).getType()

    override fun validationConfigurations(): Any? = unwrap(this).getValidationConfigurations()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnJobProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnJobProps): CfnJobProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnJobProps): software.amazon.awscdk.services.databrew.CfnJobProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.databrew.CfnJobProps
  }
}
