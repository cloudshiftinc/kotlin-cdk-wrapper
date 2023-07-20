@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnContainer
import software.amazon.awscdk.services.lightsail.CfnContainerProps
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnContainerPropsDsl {
    private val cdkBuilder: CfnContainerProps.Builder = CfnContainerProps.builder()

    private val _publicDomainNames: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun containerServiceDeployment(containerServiceDeployment: IResolvable) {
        cdkBuilder.containerServiceDeployment(containerServiceDeployment)
    }

    public fun containerServiceDeployment(containerServiceDeployment: CfnContainer.ContainerServiceDeploymentProperty) {
        cdkBuilder.containerServiceDeployment(containerServiceDeployment)
    }

    public fun isDisabled(isDisabled: Boolean) {
        cdkBuilder.isDisabled(isDisabled)
    }

    public fun isDisabled(isDisabled: IResolvable) {
        cdkBuilder.isDisabled(isDisabled)
    }

    public fun power(power: String) {
        cdkBuilder.power(power)
    }

    public fun publicDomainNames(vararg publicDomainNames: Any) {
        _publicDomainNames.addAll(listOf(*publicDomainNames))
    }

    public fun publicDomainNames(publicDomainNames: Collection<Any>) {
        _publicDomainNames.addAll(publicDomainNames)
    }

    public fun publicDomainNames(publicDomainNames: IResolvable) {
        cdkBuilder.publicDomainNames(publicDomainNames)
    }

    public fun scale(scale: Number) {
        cdkBuilder.scale(scale)
    }

    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnContainerProps {
        if (_publicDomainNames.isNotEmpty()) cdkBuilder.publicDomainNames(_publicDomainNames)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
