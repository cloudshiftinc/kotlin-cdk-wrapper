@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.common

import kotlin.Any
import kotlin.reflect.KClass
import kotlin.reflect.KFunction
import kotlin.reflect.full.companionObject
import kotlin.reflect.full.companionObjectInstance
import kotlin.reflect.full.memberFunctions

internal object CdkObjectWrappers {
  internal fun wrap(cdkObject: Any): Any? {
    val kTwin = resolveKTwin(cdkObject::class)
    return kTwin?.let{resolveWrapperFunction(kTwin)}?.call(kTwin.companionObjectInstance, cdkObject)
  }

  private fun resolveWrapperFunction(klass: KClass<*>): KFunction<*>? =
      klass.companionObject?.memberFunctions?.firstOrNull {
  it.name == "wrap" && it.parameters.size == 2 }

  private fun resolveKTwin(klass: KClass<*>): KClass<*>? {
    if (klass.isAbstract || klass.java.isInterface || klass == Any::class) return null
       return klass.qualifiedName?.replace("software.amazon.awscdk", "io.cloudshiftdev.awscdk")
        ?.replace("software.constructs", "io.cloudshiftdev.constructs")
        ?.let { try{Class.forName(it).kotlin}catch(e:ClassNotFoundException){null} }
  }
}
