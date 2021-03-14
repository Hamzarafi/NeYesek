package io.flutter.plugins;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;

import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.shim.ShimPluginRegistry;

/**
 * Generated file. Do not edit.
 * This file is generated by the Flutter tool based on the
 * plugins that support the Android platform.
 */
@Keep
public final class GeneratedPluginRegistrant {
  public static void registerWith(@NonNull FlutterEngine flutterEngine) {
    ShimPluginRegistry shimPluginRegistry = new ShimPluginRegistry(flutterEngine);
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.auth.FlutterFirebaseAuthPlugin());
    flutterEngine.getPlugins().add(new io.flutter.plugins.firebase.core.FlutterFirebaseCorePlugin());
      com.aloisdeniel.geocoder.GeocoderPlugin.registerWith(shimPluginRegistry.registrarFor("com.aloisdeniel.geocoder.GeocoderPlugin"));
    flutterEngine.getPlugins().add(new com.baseflow.geocoding.GeocodingPlugin());
    flutterEngine.getPlugins().add(new com.baseflow.geolocator.GeolocatorPlugin());
      io.flutter.plugins.googlemaps.GoogleMapsPlugin.registerWith(shimPluginRegistry.registrarFor("io.flutter.plugins.googlemaps.GoogleMapsPlugin"));
    flutterEngine.getPlugins().add(new com.lyokone.location.LocationPlugin());
    flutterEngine.getPlugins().add(new com.example.maps_launcher.MapsLauncherPlugin());
      com.ly.permission.PermissionPlugin.registerWith(shimPluginRegistry.registrarFor("com.ly.permission.PermissionPlugin"));
    flutterEngine.getPlugins().add(new io.flutter.plugins.urllauncher.UrlLauncherPlugin());
  }
}
